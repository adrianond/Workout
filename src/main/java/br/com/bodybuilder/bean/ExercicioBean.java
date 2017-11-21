package br.com.bodybuilder.bean;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.bodybuilder.constantes.ConstantesUtils;
import br.com.bodybuilder.model.Exercicios;
import br.com.bodybuilder.service.impl.AlterarExercicioImpl;
import br.com.bodybuilder.service.impl.DeletarExercicioImpl;
import br.com.bodybuilder.service.impl.InserirExercicioImpl;
import br.com.bodybuilder.service.impl.SelecionarExercicioImpl;

@ManagedBean(name = "exercicioBean")
@RequestScoped
public class ExercicioBean {

	private static final Logger logger = Logger.getLogger(ExercicioBean.class.getName());

	/** variavel incluirExercicio **/
	private Exercicios incluirExercicio = null;

	/** Mapa de musculo **/
	private Map<String, String> mapaMusculo = null;

	/** Mapa de retornoSelect **/
	private Map<String, String> retornoSelect = null;

	/** variavel musculo **/
	private String musculo = "";

	/** variavel selecionarMusculo **/
	private String selecionarMusculo = "";

	/** variavel excluir **/
	private String excluir = "";

	/** variavel exercicio **/
	private String exercicio = "";

	/** variavel exercicio **/
	private String alterarExercicio = "";

	/** variavel novoExercicio **/
	private String novoExercicio = "";

	/**
	 * Construtor Padrão
	 */
	public ExercicioBean() {
		incluirExercicio = new Exercicios();
		gerarMapa();

	}

	/**
	 * 
	 * @param musculo
	 */
	public String selectExercicios() {
		SelecionarExercicioImpl selecionar = new SelecionarExercicioImpl();
		retornoSelect = new HashMap<String, String>();

		try {
			if (this.selecionarMusculo.equals(ConstantesUtils.Biceps)) {
				retornoSelect = selecionar.selecionarExercicioBiceps();
			} else if (this.selecionarMusculo.equals(ConstantesUtils.Peito)) {
				retornoSelect = selecionar.selecionarExercicioPeito();
			} else if (this.selecionarMusculo.equals(ConstantesUtils.Costas)) {
				retornoSelect = selecionar.selecionarExercicioCostas();
			} else if (this.selecionarMusculo.equals(ConstantesUtils.Triceps)) {
				retornoSelect = selecionar.selecionarExercicioTriceps();
			} else if (this.selecionarMusculo.equals(ConstantesUtils.Ombro)) {
				retornoSelect = selecionar.selecionarExercicioOmbro();
			} else if (this.selecionarMusculo.equals(ConstantesUtils.Perna)) {
				retornoSelect = selecionar.selecionarExercicioPerna();
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, " ERRO EM: ExercicioBean.selectExercicios()", e.getMessage());
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "", e.getMessage()));
		} catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE, " ERRO EM: ExercicioBean.selectExercicios()", e.getMessage());
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "", e.getMessage()));
		}
		return "";
	}

	/**
	 * Gera o mapa de musculos
	 */
	public void gerarMapa() {
		mapaMusculo = new HashMap<String, String>();
		mapaMusculo.put(ConstantesUtils.Peito, ConstantesUtils.Peito);
		mapaMusculo.put(ConstantesUtils.Biceps, ConstantesUtils.Biceps);
		mapaMusculo.put(ConstantesUtils.Costas, ConstantesUtils.Costas);
		mapaMusculo.put(ConstantesUtils.Triceps, ConstantesUtils.Triceps);
		mapaMusculo.put(ConstantesUtils.Ombro, ConstantesUtils.Ombro);
		mapaMusculo.put(ConstantesUtils.Perna, ConstantesUtils.Perna);
	}

	/**
	 * Inseri um novo exercicio na base
	 */
	public String gravar() {
		InserirExercicioImpl incluir = new InserirExercicioImpl();

		try {
			if (this.musculo.equals(ConstantesUtils.Peito)) {
				incluirExercicio.setPeito(this.exercicio);
				incluir.inserirExercicioPeito(incluirExercicio);
			}
			if (this.musculo.equals(ConstantesUtils.Biceps)) {
				incluirExercicio.setBiceps(this.exercicio);
				incluir.inserirExercicioBiceps(incluirExercicio);
			}
			if (this.musculo.equals(ConstantesUtils.Costas)) {
				incluirExercicio.setCostas(this.exercicio);
				incluir.inserirExercicioCostas(incluirExercicio);
			}
			if (this.musculo.equals(ConstantesUtils.Triceps)) {
				incluirExercicio.setTriceps(this.exercicio);
				incluir.inserirExercicioTriceps(incluirExercicio);
			}
			if (this.musculo.equals(ConstantesUtils.Ombro)) {
				incluirExercicio.setOmbro(this.exercicio);
				incluir.inserirExercicioOmbro(incluirExercicio);
			}
			if (this.musculo.equals(ConstantesUtils.Perna)) {
				incluirExercicio.setPerna(this.exercicio);
				incluir.inserirExercicioPerna(incluirExercicio);
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, " ERRO EM: ExercicioBean.gravar()", e.getMessage());
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "", e.getMessage()));
		} catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE, " ERRO EM: ExercicioBean.gravar()", e.getMessage());
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "", e.getMessage()));
		}
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Exercicio incluído com Sucesso"));
		return "";
	}

	/**
	 * Altera um exercicio na base
	 */
	public String editar() {
		AlterarExercicioImpl editar = new AlterarExercicioImpl();
        String alterar = "Cross Over"; 
		try {
			if (this.selecionarMusculo.equals(ConstantesUtils.Peito)) {
				editar.alterarExercicioPeito(this.alterarExercicio, this.novoExercicio);
			}
			if (this.selecionarMusculo.equals(ConstantesUtils.Biceps)) {
				editar.alterarExercicioBiceps(this.alterarExercicio, this.novoExercicio);
			}
			if (this.selecionarMusculo.equals(ConstantesUtils.Costas)) {
				editar.alterarExercicioCostas(this.alterarExercicio, this.novoExercicio);
			}
			if (this.selecionarMusculo.equals(ConstantesUtils.Triceps)) {
				editar.alterarExercicioTriceps(this.alterarExercicio, this.novoExercicio);
			}
			if (this.selecionarMusculo.equals(ConstantesUtils.Ombro)) {
				editar.alterarExercicioOmbro(this.alterarExercicio, this.novoExercicio);
			}
			if (this.selecionarMusculo.equals(ConstantesUtils.Perna)) {
				editar.alterarExercicioPerna(alterar, this.novoExercicio);
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, " ERRO EM: ExercicioBean.editar()", e.getMessage());
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "", e.getMessage()));
		} catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE, " ERRO EM: ExercicioBean.editar()", e.getMessage());
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "", e.getMessage()));
		}
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Exercicio alterado com Sucesso"));
		return "";
	}

	/**
	 * Apaga um exercicio na base
	 */
	public String deletar() {
		DeletarExercicioImpl deletar = new DeletarExercicioImpl();
		String apagar = "agachamento";
		try {
			if (this.selecionarMusculo.equals(ConstantesUtils.Peito)) {
				deletar.deletarExercicioPeito(this.excluir);
			}
			if (this.selecionarMusculo.equals(ConstantesUtils.Biceps)) {
				deletar.deletarExercicioBiceps(this.excluir);
			}
			if (this.selecionarMusculo.equals(ConstantesUtils.Costas)) {
				deletar.deletarExercicioCostas(apagar);
			}
			if (this.selecionarMusculo.equals(ConstantesUtils.Triceps)) {
				deletar.deletarExercicioTriceps(this.excluir);
			}
			if (this.selecionarMusculo.equals(ConstantesUtils.Ombro)) {
				deletar.deletarExercicioOmbro(this.excluir);
			}
			if (this.selecionarMusculo.equals(ConstantesUtils.Perna)) {
				deletar.deletarExercicioPerna(apagar);
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, " ERRO EM: ExercicioBean.deletar()", e.getMessage());
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "", e.getMessage()));
		} catch (ClassNotFoundException e) {
			logger.log(Level.SEVERE, " ERRO EM: ExercicioBean.deletar()", e.getMessage());
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "", e.getMessage()));
		}
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Exercicio excluido com Sucesso"));
		return "";
	}

	/**
	 * 
	 * @return
	 */
	public Exercicios getIncluirExercicio() {
		return incluirExercicio;
	}

	/**
	 * 
	 * @param musculo
	 */
	public void setIncluirExercicio(Exercicios incluirExercicio) {
		this.incluirExercicio = incluirExercicio;
	}

	/**
	 * 
	 * @return
	 */
	public Map<String, String> getMapaMusculo() {
		return mapaMusculo;
	}

	/***
	 * 
	 * @param mapaMusculo
	 */
	public void setMapaMusculo(Map<String, String> mapaMusculo) {
		this.mapaMusculo = mapaMusculo;
	}

	/**
	 * 
	 * @return
	 */
	public Map<String, String> getRetornoSelect() {
		return retornoSelect;
	}

	/**
	 * 
	 * @param retornoSelect
	 */
	public void setRetornoSelect(Map<String, String> retornoSelect) {
		this.retornoSelect = retornoSelect;
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
	public String getSelecionarMusculo() {
		return selecionarMusculo;
	}

	/**
	 * 
	 * @param musculo
	 */
	public void setSelecionarMusculo(String selecionarMusculo) {
		this.selecionarMusculo = selecionarMusculo;
	}

	/**
	 * 
	 * @return
	 */
	public String getExcluir() {
		return excluir;
	}

	/**
	 * 
	 * @param deletar
	 */
	public void setExcluir(String excluir) {
		this.excluir = excluir;
	}

	/**
	 * 
	 * @return
	 */
	public String getExercicio() {
		return exercicio;
	}

	/**
	 * 
	 * @param novoExercicio
	 */
	public void setNovoExercicio(String novoExercicio) {
		this.novoExercicio = novoExercicio;
	}

	/**
	 * 
	 * @return
	 */
	public String getNovoExercicio() {
		return novoExercicio;
	}

	/**
	 * 
	 * @param exercicio
	 */
	public void setExercicio(String exercicio) {
		this.exercicio = exercicio;
	}

	/**
	 * 
	 * @return
	 */
	public String getAlterarExercicio() {
		return alterarExercicio;
	}

	/**
	 * 
	 * @param alterarExercicio
	 */
	public void setAlterarExercicio(String alterarExercicio) {
		this.alterarExercicio = alterarExercicio;
	}

}
