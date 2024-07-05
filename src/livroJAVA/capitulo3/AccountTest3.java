package livroJAVA.capitulo3;

import java.util.Scanner;//classe que lê as entredas de dados

//programa vai depositar na conta bancária da account1 e account2
public class AccountTest3 {
    long start = System.currentTimeMillis();
    //começo d método main
    public static void main(String[] args) throws InterruptedException {
        //cria um objeto Scanner que vai ler as entradas do nosso programa
        Scanner input = new Scanner(System.in);

        //criar objetos da classe Account
        Account3 account1 = new Account3("Erick Junior", 5500.98);
        Account3 account2 = new Account3("Ana Lyvia", -8.78);

        //exibe o valor inicial de cada objeto Account
        System.out.printf("%s balance: R$%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: R$%.2f %n%n", account2.getName(), account2.getBalance());

        //depositando na conta1
        System.out.print("Enter deposit amount for account1: R$");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance...%n%n", depositAmount);
        Thread.sleep(2000);
        account1.deposit(depositAmount);

        //exibindo os saldos
        System.out.printf("%s balance: R$%.2f %n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: R$%.2f %n",account2.getName() ,account2.getBalance());

        //depositando na conta 2
        System.out.print("%nEnter deposit amount for account2: R$");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance...%n%n", depositAmount);
        Thread.sleep(2000);
        account2.deposit(depositAmount);

        //exibindo os saldos
        System.out.printf("%s balance: R$%.2f %n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: R$%.2f %n",account2.getName() ,account2.getBalance());
    }//fim metodo main
}//fim classe AccountTest