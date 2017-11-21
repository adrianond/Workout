package br.com.bodybuilder.model;

public class Exercicios {
    
	/** variavel   biceps **/
	private String biceps = null;
	
	/** variavel  peito **/
	private String peito = null;
	
	/** variavel Observacao**/
	private String costas = null;
	
	/** variavel Observacao**/
	private String triceps = null;
	
	/** variavel Observacao**/
	private String ombro = null;
	
	/** variavel Observacao**/
	private String perna = null;
	
	/**
	 * Cosntrutor Padrão
	 */
	public Exercicios(){
		
	}
	

    /**
     * 
     * @return
     */
	public String getBiceps() {
		return biceps;
	}

    /**
     * 
     * @param biceps
     */
	public void setBiceps(String biceps) {
		this.biceps = biceps;
	}

    /**
     * 
     * @return
     */
	public String getPeito() {
		return peito;
	}

    /**
     * 
     * @param peito
     */
	public void setPeito(String peito) {
		this.peito = peito;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getCostas() {
		return costas;
	}
    
	/**
	 * 
	 * @param costas
	 */
	public void setCostas(String costas) {
		this.costas = costas;
	}

    /**
     * 
     * @return
     */
	public String getTriceps() {
		return triceps;
	}

    /**
     * 
     * @param triceps
     */
	public void setTriceps(String triceps) {
		this.triceps = triceps;
	}

    /**
     * 
     * @return
     */
	public String getOmbro() {
		return ombro;
	}

    /**
     * 
     * @param ombro
     */
	public void setOmbro(String ombro) {
		this.ombro = ombro;
	}

    /**
     * 
     * @return
     */
	public String getPerna() {
		return perna;
	}

    /**
     * 
     * @param perna
     */
	public void setPerna(String perna) {
		this.perna = perna;
	}
	
	
}
