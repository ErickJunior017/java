package cursoJava.secao15.exercicies.application;

import cursoJava.secao15.exercicies.mode.entities.Account;
import cursoJava.secao15.exercicies.mode.entities.excection.DomainWithDraw;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Account account;
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int numberAccount = input.nextInt();
            System.out.print("Holder: ");
            input.nextLine();
            String holder = input.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = input.nextDouble();
            System.out.print("Withdraw limit: ");
            double limitWithDraw = input.nextDouble();
            account = new Account(numberAccount, holder, initialBalance, limitWithDraw);
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double withDraw = input.nextDouble();
            account.withDraw(withDraw);
            System.out.println(account);
        } catch(DomainWithDraw e){
            System.out.println("Withdraw error: " + e.getMessage());
        } catch(RuntimeException e){
            System.out.println("Unspent value");
        }
    }
}
