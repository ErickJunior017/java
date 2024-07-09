package cursoJava.secao6.Repeticao;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0, numero = 1;

        while(numero != 0){
            numero = 0;
            System.out.print("\nDigite um número: ");
            numero = input.nextInt();
            soma += numero;
        }
        System.out.printf("%nSoma = %d", soma);
    }
}
