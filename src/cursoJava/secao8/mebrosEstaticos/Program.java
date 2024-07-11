package cursoJava.secao8.mebrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = input.nextDouble();

        double c = CalculatorStatic.circuference(radius);

        double v = CalculatorStatic.volume(radius);

        System.out.printf("Circuference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n",  CalculatorStatic.PI);

    }

}
