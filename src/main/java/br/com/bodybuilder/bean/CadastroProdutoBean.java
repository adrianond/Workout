package br.com.bodybuilder.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "cadastroProdutoBean")
@SessionScoped
public class CadastroProdutoBean {
	
	/**
	 * Construtor Padrão
	 */
	public CadastroProdutoBean(){
		
	}
	
	/**
	 * Inicia inclusão de aluno novo
	 */
	public String incluir(){
		
		return "";
	}

}
