import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPlayers;
        int vida;
        System.out.print("Digite o número de jogadores (até 4): ");
        numPlayers = input.nextInt();
        System.out.print("Digite a quantidade de vida inicial: ");
        vida = input.nextInt();
        Jogador[] jogadores = new Jogador[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            jogadores[i] = new Jogador("Jogador " + (i+1), vida);
        }
        while (true) {
            for (int i = 0; i < numPlayers; i++) {
                Jogador jogadorAtual = jogadores[i];
                System.out.println("Turno do " + jogadorAtual.getNome());
                System.out.println("1 - Mover");
                System.out.println("2 - Atacar");
                System.out.print("Escolha sua ação: ");
                int escolha = input.nextInt();
                if (escolha == 1) {
                    System.out.print("Digite a posição desejada (de 1 a 10): ");
                    int novaPosicao = input.nextInt();
                    jogadorAtual.mover(novaPosicao);
                } else if (escolha == 2) {
                    System.out.print("Digite o jogador alvo (de 1 a " + numPlayers + "): ");
                    int alvo = input.nextInt() - 1;
                    if (jogadorAtual.podeAtacar(jogadores[alvo])) {
                        jogadorAtual.atacar(jogadores[alvo]);
                    } else {
                        System.out.println("O jogador alvo não está na posição adjacente.");
                    }
                }
                System.out.println();
                for (int j = 0; j < numPlayers; j++) {
                    Jogador outroJogador = jogadores[j];
                    if (jogadorAtual != outroJogador && jogadorAtual.podeAtacar(outroJogador)) {
                        jogadorAtual.atacar(outroJogador);
                    }
                }
                if (jogadores[i].getVida() == 0) {
                    System.out.println("O jogador " + jogadorAtual.getNome() + " foi eliminado.");
                    numPlayers--;
                    Jogador[] novosJogadores = new Jogador[numPlayers];
                    int k = 0;
                    for (int j = 0; j < jogadores.length; j++) {
                        if (jogadores[j] != jogadorAtual) {
                            novosJogadores[k] = jogadores[j];
                            k++;
                        }
                    }
                    jogadores = novosJogadores;
                    i--;
                }
                if (numPlayers == 1) {
                    System.out.println("O jogador " + jogadores[0].getNome() + " é o vencedor!");
                    System.exit(0);
                }
            }
        }
    }
}

