package cursoJava.secao10;

import java.util.Locale;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] quantidade = new int[n];
        Product[] vect = new Product[n];

        System.out.println(vect.length);
        for (int i = 0; i < vect.length; i++){
            System.out.printf("Digite o nome do produto %d: ", i + 1);
            input.nextLine();
            String name = input.nextLine();

            System.out.printf("Digite o preço do produto %d: R$", i + 1);
            double price = input.nextDouble();

            vect[i] = new Product(name, price);

            System.out.println();
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum/vect.length;
        System.out.printf("AVERAGE PRICE = R$%.2f", avg);
    }
}
