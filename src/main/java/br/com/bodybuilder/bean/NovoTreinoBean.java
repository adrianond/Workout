package br.com.bodybuilder.bean;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.bodybuilder.Utils.BodyBuilderUtils;
import br.com.bodybuilder.constantes.ConstantesUtils;
import br.com.bodybuilder.service.impl.SelecionarExercicioImpl;

@ManagedBean(name = "novoTreinoBean")
@RequestScoped
public class NovoTreinoBean extends BodyBuilderUtils{
	
	/** variavel musculo **/
	private String musculo = "";
	
	/** variavel repeticao **/
	private String repeticao = "";
	
	/** Mapa de mapaExercicio **/
	private Map<String,String> mapaExercicio = null;
	
	
	/**
	 * Costrutor Padrão
	 */
	public NovoTreinoBean(){
		gerarMapa();
		gerarMapaRepeticao();
	}
	
	
    /**
     * Seleciona exercicio para incluir na tabela de treinos
     * @throws SQLException 
     * @throws ClassNotFoundException 
     */
	public void selecionaExercicio() throws ClassNotFoundException, SQLException {
		SelecionarExercicioImpl selecionar = new SelecionarExercicioImpl();
		List<String> listExercicio = new ArrayList<String>();
		if(this.musculo.equals(ConstantesUtils.Peito)){
			selecionar.selecionarExercicioPeito();
		}if(this.musculo.equals(ConstantesUtils.Biceps)){
			selecionar.selecionarExercicioBiceps();
		}if(this.musculo.equals(ConstantesUtils.Costas)){
			selecionar.selecionarExercicioCostas();
		}if(this.musculo.equals(ConstantesUtils.Triceps)){
			selecionar.selecionarExercicioTriceps();
		}if(this.musculo.equals(ConstantesUtils.Ombro)){
			selecionar.selecionarExercicioOmbro();
		}if(this.musculo.equals(ConstantesUtils.Perna)){
			//listExercicio = selecionar.selecionarExercicioPerna();
		}
	}


	/**
	 * 
	 * @return
	 */
	public String getMusculo() {
		return musculo;
	}
	
	/**
	 * 
	 * @param musculo
	 */
	public void setMusculo(String musculo) {
		this.musculo = musculo;
	}

    /**
     * 
     * @return
     */
	public String getRepeticao() {
		return repeticao;
	}


    /**
     * 
     * @param repeticao
     */
	public void setRepeticao(String repeticao) {
		this.repeticao = repeticao;
	}

    /**
     * 
     * @return
     */
	public Map<String, String> getMapaExercicio() {
		return mapaExercicio;
	}

    /**
     * 
     * @param mapaExercicio
     */
	public void setMapaExercicio(Map<String, String> mapaExercicio) {
		this.mapaExercicio = mapaExercicio;
	}
	
	
    
}
