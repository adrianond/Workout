package br.com.bodybuilder.model;

import java.util.Date;

import br.com.bodybuilder.service.impl.BodyBuilderBD;


public class Aluno {

	
	/** variavel nome do aluno **/
	private String nome = "";

	
	/** variavel matricula do aluno **/
	private Integer matricula;
	
	
	/** variavel CPF do aluno **/
	private String CPF = "";

	
	/** variavel idade do aluno **/
	private Integer idade;

	
	/** variavel RG do aluno **/
	private Integer rg;

	
	/** variavel data de nascimento do aluno **/
	private Date data_Nasc;

	
	/** variavel sexo do aluno **/
	private String sexo = "";

	
	/** variavel endereco/rua aluno **/
	private String endereco = "";

	
	/** variavel numero/residencia aluno **/
	private Integer numero;

	
	/** variavel complemento/endereco aluno **/
	private String complemento = "";

	
	/** variavel bairro aluno **/
	private String bairro = "";

	
	/** variavel cidade aluno **/
	private String cidade = "";

	
	/** variavel estado aluno **/
	private String estado;

	
	/** variavel data matricula aluno **/
	private String data_Matricula;

	
	/** variavel vencimento matricula aluno **/
	private String data_Vencimento;

	
	/** variavel plano academia aluno **/
	private String plano = "";

	
	/** variavel observação aluno **/
	private String observacao = "";

	/**
		 * Costrutor padrão
		 */
		public Aluno() {

		}

	/**
	 * 
	 * @param alunoEjb
	 * @return
	 */

	/*
	 * public List<String> ConsultarTreino(AlunoEjb alunoEjb) { //Lista com a
	 * serie de treinos do aluno List<String> seriesTreino = new
	 * ArrayList<String>(); BodyBuilderBD select = new BodyBuilderBD();
	 * seriesTreino = (List<String>) select.consultarTreino(alunoEjb);
	 * 
	 * return seriesTreino;
	 * 
	 * }
	 */

	/**
	 * 
	 * @param alunoEjb
	 */
	public void inserirAluno(Aluno aluno) {
		BodyBuilderBD bodyBuilder = new BodyBuilderBD();
		bodyBuilder.inserirNovoAluno(aluno);
	}

	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * 
	 * @return
	 */
	public Integer getMatricula() {
		return matricula;
	}

	/**
	 * 
	 * @param matricula
	 */
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	/**
	 * 
	 * @return
	 */
	public String getCPF() {
		return CPF;
	}

	/**
	 * 
	 * @param cPF
	 */
	public void setCPF(String cPF) {
		CPF = cPF;
	}


	/**
	 * 
	 * @return
	 */
	public Integer getIdade() {
		return idade;
	}

	/**
	 * 
	 * @param idade
	 */
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getRg() {
		return rg;
	}

	/**
	 * 
	 * @param rg
	 */
	public void setRg(Integer rg) {
		this.rg = rg;
	}

	/**
	 * 
	 * @return
	 */
	public Date getData_Nasc() {
		return data_Nasc;
	}

	/**
	 * 
	 * @param data_Nasc
	 */
	public void setData_Nasc(Date data_Nasc) {
		this.data_Nasc = data_Nasc;
	}

	public String getSexo() {
		return sexo;
	}

	/**
	 * 
	 * @param sexo
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * 
	 * @return
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * 
	 * @param endereco
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * 
	 * @return
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * 
	 * @param complemento
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * 
	 * @return
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * 
	 * @param bairro
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * 
	 * @return
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * 
	 * @param cidade
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * 
	 * @return
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * 
	 * @return
	 */
	public String getData_Matricula() {
		return data_Matricula;
	}

	/**
	 * 
	 * @param data_Matricula
	 */
	public void setData_Matricula(String data_Matricula) {
		this.data_Matricula = data_Matricula;
	}

	/**
	 * 
	 * @return
	 */
	public String getData_Vencimento() {
		return data_Vencimento;
	}

	/**
	 * 
	 * @param data_Vencimento
	 */
	public void setData_Vencimento(String data_Vencimento) {
		this.data_Vencimento = data_Vencimento;
	}

	/**
	 * 
	 * @return
	 */
	public String getPlano() {
		return plano;
	}

	/**
	 * 
	 * @param plano
	 */
	public void setPlano(String plano) {
		this.plano = plano;
	}

	/**
	 * 
	 * @return
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * 
	 * @param observacao
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
