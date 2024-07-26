package cursoJava.secao14.entities.application;

import cursoJava.secao14.entities.Account;
import cursoJava.secao14.entities.BusinessAccount;
import cursoJava.secao14.entities.SavingsAccount;

public class Program2 {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withDraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withDraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1004, "Erick", 1000.00, 200.0);
        acc3.withDraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
