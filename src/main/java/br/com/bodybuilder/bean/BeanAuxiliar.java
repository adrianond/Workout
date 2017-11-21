package br.com.bodybuilder.bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "beanAuxiliar")
@SessionScoped
public class BeanAuxiliar {

/** Data e hora atual**/	
private String  data = null;	


	/**
	 * Construtor Padrão
	 */
	public BeanAuxiliar(){
	
	 DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	 Date today = Calendar.getInstance().getTime(); 
	 this.data = df.format(today);
	
	}
	
		
	/**
	 * get data
	 * @return
	 */
	public String getData() {
		return data;
	}
    
	/**
	 * set data
	 * @param data
	 */
	public void setData(String data) {
		this.data = data;
	}
	
}
