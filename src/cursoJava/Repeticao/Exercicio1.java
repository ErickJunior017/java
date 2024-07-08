package cursoJava.Repeticao;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%nDefina sua senha: ");
        int senha = input.nextInt();
        int senhaAtual = 0;
        while (senhaAtual != senha){
            System.out.printf("%nDigite a senha: ");
            senhaAtual = input.nextInt();
            if (senhaAtual != senha){
                System.out.printf("Senha Invalida%n");
            }else {
                System.out.printf("Acesso Permitido%n");
            }
        }
    }
}
