package cursoJava.secao10.exercicios;

import java.util.Locale;
import java.util.Scanner;
public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar: ");
        int n = input.nextInt();
        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("Digite um número: ");
            numeros[i] = input.nextDouble();
        }

        System.out.printf("%nValores = ");

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("%.2f  ", numeros[i]);
        }

        double sum = 0.0;

        for (int i = 0; i < numeros.length; i++){
            sum += numeros[i];
        }

        System.out.printf("%nSoma = %.2f", sum);

        double media = sum/n;
        System.out.printf("%nMEDIA = %.2f", media);
    }
}
