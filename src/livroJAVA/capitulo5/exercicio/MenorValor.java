package livroJAVA.capitulo5.exercicio;

import java.util.Scanner;

public class MenorValor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menor = 999999999, num;
        System.out.printf("%nDigite a quantidade de números que deseja inserir: ");
        int quantidade = input.nextInt();
        for(int i = 1; i <= quantidade; i++){
            System.out.printf("%nDigite um número: ");
            num = input.nextInt();

            if (num < menor){
                menor = num;
            }
        }
        System.out.printf("%nO Menor valor inserido foi %d %n", menor);
    }

}
