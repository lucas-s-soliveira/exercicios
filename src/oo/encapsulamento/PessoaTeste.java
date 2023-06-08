package oo.encapsulamento;

public class PessoaTeste {
public static void main(String[] args) {
	Pessoa p1 = new Pessoa("Pedro" ,230);
	System.out.println(p1.getIdade());
	p1.setIdade(120);
	System.out.println(p1.getIdade());
	System.out.println(p1.getNome());
}
}
