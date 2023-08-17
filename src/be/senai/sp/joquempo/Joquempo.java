package be.senai.sp.joquempo;

import java.util.Random;
import java.util.Scanner;

public class Joquempo {
    public static void main(String[] args) {
/** Joquempo
 *  Data: 17/08/1023
 *  Autor: Rafael Sena Andrade de Sousa
 */

  /** Aplicar Variaveis */
  Scanner scanner = new Scanner(System.in);
  Random random = new Random();

  String[] opcoes = {"Pedra", "Papel","Tesoura"};

  /** Sequencia de dados */
  System.out.println("Ecolha = 0- Pedra 1- Papel 2- Tesoura ");
  int escolhaJogador = scanner.nextInt();

  if (escolhaJogador < 0 || escolhaJogador > 2){
      System.out.println("Escolha inválida. Jogo encerrado");
      return;
  }

  int escolhaComputador = random.nextInt(3);

        System.out.println("Jogador Escolheu:" + opcoes[escolhaJogador]);
        System.out.println("Computador Escolheu:" + opcoes[escolhaComputador]);

        if (escolhaJogador == escolhaComputador){
            System.out.println("Empate");
        } else if ((escolhaJogador== 0 && escolhaComputador == 2) ||
                   (escolhaJogador== 1 && escolhaComputador == 0) ||
                   (escolhaJogador== 2 && escolhaComputador == 1)) {
            System.out.println("Jogador Venceu !!");
        } else {
            System.out.println("Computador venceu !!");

        }


    }
}
