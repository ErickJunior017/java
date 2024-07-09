package cursoJava.secao6.EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inicio, fim, duracao;
        System.out.printf("%nDigite o começo do jogo: ");
        inicio = input.nextInt();
        System.out.printf("%nDigite o fim do jogo: ");
        fim = input.nextInt();
        if (fim < inicio){
            duracao = (24 - inicio) + fim;
        }
        else{
            duracao = fim - inicio;
        }

        System.out.printf("%nA partida durou %d hora(s) %n%n", duracao);
    }
}
