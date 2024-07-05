package livroJAVA.capitulo2;

import java.util.Scanner;

//programa que vai ler dois números inteiros e soma eles e também mostra o resultado

public class AdicionandoInt {

    // método main inicia a execução do aplicativo Java
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1, number2, soma;
        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        System.out.print("Enter Second number: ");
        number2 = input.nextInt();
        soma = number1 + number2;
        System.out.printf("Som is %d%n", soma);//exibe a soma
    }//fim método main

}//fim da class AdicionandoInt
