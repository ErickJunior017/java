package cursoJava.secao8;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangule X: ");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();

        System.out.println("Enter the measures of triangule Y: ");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangule X area: %.4f%n", areaX);
        System.out.printf("Triangule Y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X");
        }else {
            System.out.println("Larger area: Y");

        }
    }
}
