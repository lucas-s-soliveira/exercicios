package oo.encapsulamento;

public class Pessoa {
	private int idade;
	private String nome;
public String getNome() {
	return nome;
}
	public Pessoa(String nome ,int idade) {
		this.nome = nome;
		if (idade >= 0 && idade<=150 )
			this.idade = idade;
		else {
			System.out.println("idade invalida");
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int novaIdade) {

		while (novaIdade <= 0 || novaIdade >=150) {
			System.out.println("Idade invalida");
		
		} 
		if(novaIdade >= 0 ) {	this.idade = novaIdade;
		}
	}
}
