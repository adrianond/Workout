package br.com.bodybuilder.Utils;

import java.util.HashMap;
import java.util.Map;

import br.com.bodybuilder.constantes.ConstantesUtils;

public class BodyBuilderUtils {

	/** Mapa de musculo **/
	private Map<String,String> mapaMusculo = null;
	
	/** Mapa de musculo **/
	private Map<String,String> mapaRepeticao = null;
	
	/**
	 * Construtor Padrão
	 */
	public BodyBuilderUtils(){
		
	}
	
	/**
	 * Gera o mapa de musculos
	 */
	public  void gerarMapa() {
		mapaMusculo = new HashMap<String, String>();
		mapaMusculo.put(ConstantesUtils.Peito,ConstantesUtils.Peito);
		mapaMusculo.put(ConstantesUtils.Biceps,ConstantesUtils.Biceps);
		mapaMusculo.put(ConstantesUtils.Costas,ConstantesUtils.Costas);
		mapaMusculo.put(ConstantesUtils.Triceps,ConstantesUtils.Triceps);
		mapaMusculo.put(ConstantesUtils.Ombro,ConstantesUtils.Ombro);
		mapaMusculo.put(ConstantesUtils.Perna,ConstantesUtils.Perna);
	}
	
	/**
	 * Gera o mapa de repetição
	 */
	public void gerarMapaRepeticao() {
		mapaRepeticao = new HashMap<String, String>();
		mapaRepeticao.put("3 X 10", "3 X 10");
		mapaRepeticao.put("4 X 10", "4 X 10");
		mapaRepeticao.put("3 X 12", "3 X 12");
		mapaRepeticao.put("4 X 8",  "4 X 8");
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
	public Map<String, String> getmapaRepeticao() {
		return mapaRepeticao;
	}
    
	/**
	 * 
	 * @param mapaRepeticao
	 */
	public void setmapaRepeticao(Map<String, String> mapaRepeticao) {
		this.mapaRepeticao = mapaRepeticao;
	}
	
	
	
}
