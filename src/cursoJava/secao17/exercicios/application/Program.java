package cursoJava.secao17.exercicios.application;

import cursoJava.secao17.exercicios.entities.Product;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "c:\\out\\summary.csv";
        String product = sc.nextLine();
        String product2 = sc.nextLine();
        String product3 = sc.nextLine();
        String product4 = sc.nextLine();
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(path, true))){
            String[] informacoesDoProduto = product.split(",");
            Product vectProduct1 = new Product(informacoesDoProduto[0], Double.parseDouble(informacoesDoProduto[1]), Integer.parseInt(informacoesDoProduto[2]));
            bf.write(vectProduct1.toString());
            bf.newLine();

            String[] informacoesDoProduto2 = product2.split(",");
            Product vectProduct2 = new Product(informacoesDoProduto2[0], Double.parseDouble(informacoesDoProduto2[1]), Integer.parseInt(informacoesDoProduto2[2]));
            bf.write(vectProduct2.toString());
            bf.newLine();

            String[] informacoesDoProduto3 = product.split(",");
            Product vectProduct3 = new Product(informacoesDoProduto3[0], Double.parseDouble(informacoesDoProduto3[1]), Integer.parseInt(informacoesDoProduto3[2]));
            bf.write(vectProduct3.toString());
            bf.newLine();

            String[] informacoesDoProduto4 = product.split(",");
            Product vectProduct4 = new Product(informacoesDoProduto4[0], Double.parseDouble(informacoesDoProduto4[1]), Integer.parseInt(informacoesDoProduto4[2]));
            bf.write(vectProduct4.toString());
            bf.newLine();

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
