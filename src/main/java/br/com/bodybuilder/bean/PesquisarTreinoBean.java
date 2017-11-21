package br.com.bodybuilder.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.bodybuilder.constantes.ConstantesUtils;
import br.com.bodybuilder.model.Aluno;
import br.com.bodybuilder.properties.MessagePropertiesAcess;

@ManagedBean(name = "pesquisarTreinoBean")
@RequestScoped
public class PesquisarTreinoBean {
    
	/** Variavel de instância aluno **/
	private Aluno aluno = null;
	
	
	/**
	 * Cosntrutor Padrão
	 */
	public PesquisarTreinoBean(){
		
		aluno = new Aluno();
	}
	
	/**
	 * Série de treinos
	 * @return
	 */
	public String dadosSerieTreino(){
		validarDados();
		dadosConsultaTreino(aluno);
		
		
		return "";
	}
    
	/**
	 * 
	 * @param alunoEjb
	 */
	private void dadosConsultaTreino(Aluno aluno) {
		//Lista com a serie de treinos do aluno
		List<String> seriesTreino = new ArrayList<String>();
		
		//Passa os dados para consulta do treino do aluno
		//seriesTreino = aluno.ConsultarTreino(aluno);
	}

	/**
	 * Valida se os dados do formulário foram preenchidos
	 */
	public void validarDados() {
        if(aluno.getNome().equals("") || aluno.getCPF().equals("") || aluno.getMatricula() == ConstantesUtils.ZERO){
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage( null, new FacesMessage(FacesMessage.SEVERITY_INFO, MessagePropertiesAcess.propertiesLoader().getProperty("rotulo_consulta_treino").toString(), 
					MessagePropertiesAcess.propertiesLoader().getProperty("rotulo_consulta_treino").toString()));
		}
	}

	/**
	 *  
	 * @return
	 */
	public Aluno getAluno() {
		return aluno;
	}
    
	/**
	 *  
	 * @param aluno
	 */
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	
	
	
}
