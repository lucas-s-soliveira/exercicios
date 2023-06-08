package oo.encapsulamento.casaA;

public class Lucas {
	
	Ana esposa = new Ana();
	void testeAcessos() { 
		
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	//	System.out.println(esposa.segredo); não tem acesso por ser private
		
	}
		
}
