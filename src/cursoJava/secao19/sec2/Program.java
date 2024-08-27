package cursoJava.secao19.sec2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        String path = "C:\\temp\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line  = br.readLine();
            while(line != null){
                String[] nameAndPrice = line.split(",");
                list.add(new Product(Double.parseDouble(nameAndPrice[1]), nameAndPrice[0]));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.print("Most Expensive: ");
            System.out.println(x);
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
