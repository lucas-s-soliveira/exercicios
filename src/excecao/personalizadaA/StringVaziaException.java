package excecao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {
	
	
	private String nomeDoAributo;
@SuppressWarnings("unused")
private void NumeroNegativoException(String nomeDoAtributo) {
	
	this.nomeDoAributo = nomeDoAtributo;
	
}
@Override
public String getMessage() {
	
	return String.format("Oatributo %s está vazio", nomeDoAributo);
}
}
