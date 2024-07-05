package livroJAVA.capitulo2;

import java.util.Scanner;// programa que scaneia as entradas de dados

//Objetivo do programa é indentificar o Maior e menor número entre 5 números inteiros
public class ExercicoCAP2EX2 {
    //Começo do método Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declaração das variaveis
        int menorNumero, maiorNumero, number1, number2, number3, number4, number5;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        System.out.print("Enter secund number: ");
        number2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        number3 = input.nextInt();
        System.out.print("Digite o quarto número: ");
        number4 = input.nextInt();
        System.out.print("Digite o quinto número: ");
        number5 = input.nextInt();
        menorNumero = number1;
        maiorNumero = number1;
        //Indentificando o menor número inteiro
        if (number1 < menorNumero){
            menorNumero = number1;
        }
        if (number2 < menorNumero){
            menorNumero = number2;
        }
        if (number3 < menorNumero) {
            menorNumero = number3;
        }
        if (number4 < menorNumero){
            menorNumero = number4;
        }
        if (number5 < menorNumero){
            menorNumero = number5;
        }

        //Indentificando o maior número inteiro
        if (number1 > maiorNumero){
            maiorNumero = number1;
        }

        if (number2 > maiorNumero){
            maiorNumero = number2;
        }

        if (number3 > maiorNumero){
            maiorNumero = number3;
        }

        if (number4 > maiorNumero){
            maiorNumero = number4;
        }

        if (number5 > maiorNumero){
            maiorNumero = number5;
        }

        //Imprimindo o Maior e menos número inteiro
        System.out.printf("Maior número: %d%n", maiorNumero);
        System.out.printf("Menor número: %d%n", menorNumero);
        System.out.printf("O caracter %c tem o valor %d%n", 'B', (int) 'B');
        System.out.printf("Os caracteres %c %c %c %c %c %c %c %c %c %c %c %c %c %c tem os respectivamente os valores %d %d %d %d %d %d %d %d %d %d %d %d %d %d", 'A', 'B',
        'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' ',(int) 'A',(int) 'B', (int) 'C',(int) 'a',(int) 'b',(int) 'c',(int) '0',(int) '1',(int) '2',(int) '$',(int) '*',(int) '+',(int) '/',(int) ' ');
    }//Fim método Main
}//Fim Classe ExercicioCAP2EX2
