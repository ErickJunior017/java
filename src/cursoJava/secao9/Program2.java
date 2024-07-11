package cursoJava.secao9;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Price: ");
        double price = input.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = input.nextInt();

        Products product = new Products(name, price, quantity);

        //Mostrando os dados
        System.out.println("\nProduct data: "+ product);

        System.out.printf("%nEnter the number of products to be added from stock: ");
        quantity = input.nextInt();
        product.addProducts(quantity);

        System.out.println("\nUpdate data: "+ product);

        System.out.printf("%nEnter the number of products to be removed from stock: ");
        quantity = input.nextInt();
        product.removeProducts(quantity);

        System.out.println("\nUpdate data: "+ product);
    }
}
