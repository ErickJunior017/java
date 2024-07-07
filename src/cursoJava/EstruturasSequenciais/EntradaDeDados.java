package cursoJava.EstruturasSequenciais;

import java.util.Scanner;
import java.util.Locale;
public class EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        char a;
        System.out.println("Digite uma palavra:");
        a = input.next().charAt(0);
        System.out.println(a);

        System.out.println("Digite uma palavra:");
        a = input.next().charAt(1);
        System.out.println(a);

    }

}
