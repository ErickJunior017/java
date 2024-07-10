package cursoJava.secao8;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangule X: ");
        xA = input.nextDouble();
        xB = input.nextDouble();
        xC = input.nextDouble();

        System.out.println("Enter the measures of triangule Y: ");
        yA = input.nextDouble();
        yB = input.nextDouble();
        yC = input.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));


        System.out.printf("Triangule X area: %.4f%n", areaX);
        System.out.printf("Triangule Y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X");
        }else {
            System.out.println("Larger area: Y");

        }
    }
}
