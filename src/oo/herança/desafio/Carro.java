package oo.herança.desafio;

public class Carro {
	int VELOCIDADE_MAXIMA;

	String nome;
	int velocidade = 0;
	private int delta = 5;

	public int getDelta() {
		return delta;
	}
	public void setDelta(int delta) {
		this.delta = delta;
	}
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	public Carro() {
		this.VELOCIDADE_MAXIMA = 120;
		// TODO Auto-generated constructor stub
	}

	public void acelelar() {
		if (velocidade + delta > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += delta;
		}

	}

	public void frear() {
		if (velocidade >= 0) {
			velocidade -= 5;
		} else {
			velocidade = 0;
		}
	}

	public String toString() {
		return "A velocidade atual é " + velocidade + " KM/H";
	};

};
