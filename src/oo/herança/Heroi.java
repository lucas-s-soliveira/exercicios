package oo.herança;

public class Heroi extends Jogador {
	public Heroi(int x, int y) {
		super(0, 0);
		// TODO Auto-generated constructor stub
	}

	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);

		return ataque1 || ataque2;

	}

}
