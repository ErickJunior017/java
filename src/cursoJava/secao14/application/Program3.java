package cursoJava.secao14.application;

import cursoJava.secao14.entities.SavingsAccount;
import cursoJava.secao14.entities.Account;

public class Program3 {
    public static void main(String[] args) {
        Account x = new Account(1020, "Alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withDraw(50.0);
        y.withDraw(50.0);
        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
