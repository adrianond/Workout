package br.com.bodybuilder.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "parceriasBean")
@SessionScoped
public class ParceriasBean {
	
	/**
	 * ConstrutorPadr�o
	 */
    public ParceriasBean(){
    	
    }
    
    /**
     * Retorna lista de parceiros 
     * @return
     */
    public String consulta(){
    	
    	return "";
    }
}
