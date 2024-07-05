package livroJAVA.capitulo3.exercicios;

import livroJAVA.capitulo3.exercicios.Account4;

import java.util.Scanner;

public class AccountTest4{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account4 account1 = new Account4("Erick Junior", 5500.98);
        Account4 account2 = new Account4("Ana Lyvia", -8.78);

        System.out.printf("%s balance: R$%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: R$%.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account1: R$");
        double depositAmount = input.nextDouble();
        System.out.printf("%nAdding %.2f to account1 balance...%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: R$%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: R$%.2f%n", account2.getName(), account2.getBalance());

        System.out.print("\nEnter deposit amount for account2: R$");
        depositAmount = input.nextDouble();
        System.out.printf("%nAdding %.2f to account2 balance...%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: R$%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: R$%.2f%n", account2.getName(), account2.getBalance());

        double withDraw = 0;
        System.out.print("\nDo you want to make a withdrawal from account1? (Enter \"yes\" or \"no\"): ");
        input.nextLine(); // Consume the newline
        String realizarDebito = input.nextLine();
        if (realizarDebito.equals("yes")) {
            System.out.print("Amount to withdraw: R$");
            withDraw = input.nextDouble();

            if (withDraw > account1.getBalance()) {
                System.out.println("Withdrawal amount exceeds account balance");
            } else {
                System.out.println("\nPerforming withdrawal...");
                account1.withDraw(withDraw);
            }
        } else {
            System.out.println("\nOk\n");
        }
        System.out.printf("%s balance: R$%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: R$%.2f%n", account2.getName(), account2.getBalance());

        withDraw = 0;
        System.out.print("\nDo you want to make a withdrawal from account2? (Enter \"yes\" or \"no\"): ");
        input.nextLine(); // Consume the newline
        realizarDebito = input.nextLine();
        if (realizarDebito.equals("yes")) {
            System.out.print("Amount to withdraw: R$");
            withDraw = input.nextDouble();

            if (withDraw > account2.getBalance()) {
                System.out.println("Withdrawal amount exceeds account balance");
            } else {
                System.out.println("\nPerforming withdrawal...");
                account2.withDraw(withDraw);
            }
        } else {
            System.out.println("\nOk\n");
        }
        System.out.printf("%s balance: R$%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: R$%.2f%n%n", account2.getName(), account2.getBalance());
    }
}
