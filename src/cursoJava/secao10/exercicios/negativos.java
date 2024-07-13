package cursoJava.secao10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite quantos números você vai digitar(max: 10): ");
        int n = input.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um número inteiro: ");
            numeros[i] = input.nextInt();
        }
        System.out.println("NÚMEROS NEGATIVOS: ");
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] < 0){
                System.out.println(numeros[i]);
            }
        }
    }
}
