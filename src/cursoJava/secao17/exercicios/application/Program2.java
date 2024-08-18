package cursoJava.secao17.exercicios.application;

import cursoJava.secao17.exercicios.entities.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
            System.out.print("Quantidade de produtos: ");
            int quantidade = input.nextInt();

            for (int i = 0; i < quantidade; i++) {
                System.out.print("Name of Product: ");
                input.nextLine();
                String name = input.nextLine();
                System.out.print("Price: ");
                double price = input.nextDouble();
                System.out.print("Quantity of product: ");
                int quantity = input.nextInt();
                list.add(new Product(name, price, quantity));
            }
            System.out.println();
            input.nextLine();
            System.out.print("Digite o caminho: ");
            String path = input.nextLine();
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(path))){
            for (Product product : list) {
                bf.write(product.toString());
                bf.newLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
