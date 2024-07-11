package cursoJava.secao8.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height respective: ");
        rectangle.width = input.nextDouble();
        rectangle.height = input.nextDouble();

        System.out.printf("Area = %.2f", rectangle.area());
        System.out.printf("%nPerimeter = %.2f", rectangle.perimetro());
        System.out.printf("%nDiagonal = %.2f", rectangle.diagonal());
    }
}
