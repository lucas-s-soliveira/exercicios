package oo.herança.teste;

import oo.herança.desafio.Ferrari;
import oo.herança.desafio.Marea;

public class Ciruito {
	public static void main(String[] args) {

		Ferrari c1 = new Ferrari( 250);
		Marea c2 = new Marea();

		System.out.println();
		System.out.println(c1.nome);
		c1.acelelar();

		System.out.println(c1);
		c2.acelelar();

		c1.frear();
		System.out.println(c1);
		c1.ligarTurbo();
		System.out.println("Turbo ligado");
		c1.acelelar();
		System.out.println(c1);
		System.out.println(c2.nome);
		c2.acelelar();
		c2.acelelar();
		c2.acelelar();
		System.out.println(c2);
		c2.frear();
	System.out.println(	c1.nivelDoAr());
		
	}
}
