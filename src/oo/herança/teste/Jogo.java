package oo.herança.teste;

import oo.herança.Direcao;
import oo.herança.Heroi;
import oo.herança.Jogador;
import oo.herança.Monstro;

public class Jogo {
	public static void main(String[] args) {
		Jogador j1 = new Monstro();
		j1.x = 10;
		j1.y = 10;
		
		Jogador j2 = new Heroi(0,0);
		j2.x = 10;
		j2.y = 11;
		
		System.out.println(j1.vida);
		System.out.println( "o monstro tem :" + j1.vida);
		j1.atacar(j2);
		System.out.println( "o monstro tem :" + j1.vida);
		j2.atacar(j1);
		System.out.println("O monstro tem vida : " + j1.vida);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
	//	System.out.println(j1.y);
	//	System.out.println(j1.x);

	}

}
