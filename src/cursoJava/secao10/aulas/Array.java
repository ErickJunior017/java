package cursoJava.secao10.aulas;

import java.util.Locale;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("%nDigite a altura %d: ", i + 1);
            vect[i] = input.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++){
            sum += vect[i];
        }

        double avg = sum/n;
        System.out.printf("AVERAGE HEIGHT: %.2f", avg);

        input.close();
    }
}
