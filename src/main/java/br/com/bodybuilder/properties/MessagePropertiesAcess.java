package br.com.bodybuilder.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import javax.faces.context.FacesContext;

public class MessagePropertiesAcess {

	/** Properties Instance **/
	private static Properties prop = new Properties();

	// Crio um método estático que pode ser acessado por outras classes da  aplicação sem a necessidade de instanciar
	public static Properties propertiesLoader() {

		// Informo o caminho onde se encontra meu arquivo properties de forma dinâmica
		// Poderia fazer isso de forma estática passando o diretório completo, mas obviamente isso não é muito interessante.
		String atualDir = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/")+ "WEB-INF/classes/Messages_pt.properties";
		try { 
			// Tento recuperar as informações do arquivo de propriedades apenas para testar imprimo o diretório atual do meu arquivo properties
			System.out.println(atualDir);
			// Crio uma instância de File passando o meu arquivo .properties via construtor
			File file = new File(atualDir);
			// Agora crio uma instância de FileInputStream passando via construtor o objeto file instanciado acima
			FileInputStream fileInputStream = new FileInputStream(file);
			// Leio o fileInputStream recuperando assim o mapa contendo chaves e valores
			prop.load(fileInputStream);
			// Fecho o fileInputStream
			fileInputStream.close();
		} catch (Exception e) {
			// Trato possíveis exceções
			System.out.println(e.getMessage());
		}
		// Retorno um objeto prop com o mapa correspondente ao meu arquivo properties
		return prop;
	}
}
