package br.com.bodybuilder.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "fornecedoresBean")
@SessionScoped
public class FornecedoresBean {
    
	/**
	 * Construtor Padrão
	 */
	public FornecedoresBean(){
		
	}
	
	/**
	 * Fornecedores 
	 * @return
	 */
	public String listaFornecedores(){
	
		return "";
	}
}
