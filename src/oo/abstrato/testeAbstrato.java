package oo.abstrato;

public class testeAbstrato {

	public static void main(String[] args) {
		Cachorro a = new Cachorro();
		System.out.println(a.mamar());
		System.out.println(a.respirar());
		System.out.println(a.mover());
	}
}
