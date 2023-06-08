package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroNegaivoException extends RuntimeException {
	
	
	private String nomeDoAributo;
@SuppressWarnings("unused")
private void NumeroNegativoException(String nomeDoAtributo) {
	
	this.nomeDoAributo = nomeDoAtributo;
	
}
@Override
public String getMessage() {
	
	return String.format("Oatributo %s está negativo", nomeDoAributo);
}
}
