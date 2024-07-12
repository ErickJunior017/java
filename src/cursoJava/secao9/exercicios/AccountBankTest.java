package cursoJava.secao9.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AccountBankTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double amount ;

        System.out.printf("Enter account number: ");
        int numberAccount = input.nextInt();

        System.out.printf("Enter account holder: ");
        input.nextLine();
        String name = input.nextLine();
        AccountBank accountBank = new AccountBank(numberAccount, name);

        System.out.printf("Is there na initial deposit (y/n): ");
        char decisao = input.next().charAt(0);
        if (decisao == 'y'){
            System.out.printf("Enter initial deposit value: $");
            amount = input.nextDouble();
            accountBank = new AccountBank(amount);
        }

        System.out.printf("%nAccount data: %n");
        System.out.println(accountBank);

        System.out.printf("%nEnter a deposit value: $");
        amount = input.nextDouble();
        accountBank.deposit(amount);
        System.out.printf("Updated account data: %n");
        System.out.println(accountBank);

        System.out.printf("%nEnter a withdraw value: $");
        amount = input.nextDouble();
        accountBank.withDraw(amount);
        System.out.printf("Updated account data: %n");
        System.out.println(accountBank);
    }
}
