package cursoJava.secao15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Digite sua data de nascimento: ");
            Date birthday = sdf.parse(input.nextLine());
        } catch (ParseException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
