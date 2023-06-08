package oo.herança.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	public String nome = "Ferrari";
	boolean ligarTurbo;
	boolean ligarAr;
	
	public Ferrari(int velocidadeMaxima) {
		super.VELOCIDADE_MAXIMA = velocidadeMaxima;
		setDelta(20);

	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;

	}

	@Override
	public void desligarAr() {
	ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if (ligarTurbo == true)
			return 40;
		else  return 20;}

	@Override
	public
	
	 int nivelDoAr() {
		
		return 1;
	}
}

