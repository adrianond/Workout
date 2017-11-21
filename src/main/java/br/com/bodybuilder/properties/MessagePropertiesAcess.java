package br.com.bodybuilder.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import javax.faces.context.FacesContext;

public class MessagePropertiesAcess {

	/** Properties Instance **/
	private static Properties prop = new Properties();

	// Crio um m�todo est�tico que pode ser acessado por outras classes da  aplica��o sem a necessidade de instanciar
	public static Properties propertiesLoader() {

		// Informo o caminho onde se encontra meu arquivo properties de forma din�mica
		// Poderia fazer isso de forma est�tica passando o diret�rio completo, mas obviamente isso n�o � muito interessante.
		String atualDir = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/")+ "WEB-INF/classes/Messages_pt.properties";
		try { 
			// Tento recuperar as informa��es do arquivo de propriedades apenas para testar imprimo o diret�rio atual do meu arquivo properties
			System.out.println(atualDir);
			// Crio uma inst�ncia de File passando o meu arquivo .properties via construtor
			File file = new File(atualDir);
			// Agora crio uma inst�ncia de FileInputStream passando via construtor o objeto file instanciado acima
			FileInputStream fileInputStream = new FileInputStream(file);
			// Leio o fileInputStream recuperando assim o mapa contendo chaves e valores
			prop.load(fileInputStream);
			// Fecho o fileInputStream
			fileInputStream.close();
		} catch (Exception e) {
			// Trato poss�veis exce��es
			System.out.println(e.getMessage());
		}
		// Retorno um objeto prop com o mapa correspondente ao meu arquivo properties
		return prop;
	}
}
