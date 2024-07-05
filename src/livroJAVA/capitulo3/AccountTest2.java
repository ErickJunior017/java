package livroJAVA.capitulo3;

import java.util.Scanner;

public class AccountTest2 {
    public static void main(String[] args){
        //cria um objeto Scanner que vai ler as entradas do nosso programa
        Scanner input = new Scanner(System.in);
        Account2 account1 = new Account2("Erick Junior");
        Account2 account2 = new Account2("Ana Lyvia");

        //exibe o valor inicial de cada objeto Account
        System.out.printf("Initial name is: %s%n", account1.getName());
        System.out.printf("account2 name is %s%n", account2.getName());

        //Pedindo para o usuário digitar seu nome e atribuir a variavel theName
        //e depois passado
        System.out.print("Enter the name: ");
        String theName = input.nextLine();
        account1.setName(theName);

        // Imprimindo a o retorno do método getName da classe Account
        System.out.printf("Name in object myAccount is %s%n",
                account1.getName());
    }
}