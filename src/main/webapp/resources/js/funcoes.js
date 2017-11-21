/**
 * Valida os dados digitados são apenas valores númericos
 */
function onlyValuesNumber(valor) {
	alert(" JS ");

	var regra = /^[0-9]+$/;
	  if (valor.match(regra)) {
	    alert("Numero: "+valor);
	  }else{
	    alert("Permitido somente número inteiro positivo!");
	    valor = "";
	  }

};