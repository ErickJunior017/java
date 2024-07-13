package cursoJava.secao10.desafios;

import java.util.Scanner;

public class Alugando {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Quarto[] quarto = new Quarto[10];

        System.out.printf("How many rooms will be rented? ");
        int quantidade = input.nextInt();

        for (int i = 1; i <= quantidade; i++){
            System.out.printf("%nRent #%d: %n", i+1);
            System.out.printf("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.printf("Email: ");
            String email = input.nextLine();
            System.out.printf("Room: ");
            int numero = input.nextInt();
            quarto[numero] = new Quarto(name, email, numero);
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < quarto.length; i++){
            if (quarto[i] != null){
                System.out.println(quarto[i].toString());
            }
        }
    }
}
