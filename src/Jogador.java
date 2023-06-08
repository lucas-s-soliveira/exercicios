
public class Jogador {
	
	
public Jogador() {
	
}

    private String nome;
    private int posicao;
    private int vida;

    public Jogador(String nome, int vida) {
        this.nome = nome;
        this.posicao = 1;
        this.vida = vida;
    }

    public String getNome() {
        return this.nome;
    }

    public int getPosicao() {
        return this.posicao;
    }

    public int getVida() {
        return this.vida;
    }

	public void mover(int novaPosicao) {
		// TODO Auto-generated method stub
		
	}

	public boolean podeAtacar(Jogador jogador) {
		// TODO Auto-generated method stub
		return false;
	}

	public void atacar(Jogador jogador) {
		// TODO Auto-generated method stub
		
	}

	      


}
