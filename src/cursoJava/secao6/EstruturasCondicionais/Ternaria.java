package cursoJava.secao6.EstruturasCondicionais;

import java.util.Scanner;

public class Ternaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double largura = input.nextDouble();
        double comprimento = input.nextDouble();
        double metroQuadrado = input.nextDouble();

        double area = input.nextDouble();
        double preco = input.nextDouble();

        System.out.printf("Area = %.2f %n", area);
        System.out.printf("Preço = %.2f %n", preco);

        input.close();
    }
}
