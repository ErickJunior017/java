package cursoJava.secao14.exercicios.aplication;

import cursoJava.secao14.exercicios.entities.ImportedProduct;
import cursoJava.secao14.exercicios.entities.Product;
import cursoJava.secao14.exercicios.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program2 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int quantity = input.nextInt();
        input.nextLine();
        System.out.println();

        for (int i = 0; i < quantity; i++){
            System.out.println("Product #" + i +1 + " data:");
            System.out.print("Cammon, used or imported (c/u/i)? ");
            char type = input.next().charAt(0);
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Price: ");
            double price = input.nextDouble();
            if (type == 'u'){
                input.nextLine();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String dataInString = input.nextLine();
                Date date = sdf.parse(dataInString);
                list.add(new UsedProduct(name, price, date));
            }else if(type == 'i'){
                System.out.print("Customs fee: ");
                double customFee = input.nextDouble();
                list.add(new ImportedProduct(name, price, customFee));
            }else {
                list.add(new Product(name, price));
            }
            System.out.println();
        }
        System.out.println("PRICE TAGS:");
        for (Product p : list){
            System.out.println(p.priceTag());
        }
    }
}
