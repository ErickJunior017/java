package livroJAVA.capitulo3;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){
        //cria um objeto Scanner que vai ler as entradas do nosso programa
        Scanner input = new Scanner(System.in);
        Account account1 = new Account();

        //exibe o valor inicial de cada objeto Account
        System.out.printf("Initial name is: %s%n", account1.getName());

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