package cursoJava.secao10.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AlturaTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.printf("Quantas pessoas serao digitadas? ");
        int n = input.nextInt();

        Altura[] pessoa = new Altura[n];
        System.out.println();
        for (int i = 0; i < pessoa.length; i++){
            System.out.println("Dados da " + (i + 1) + "a passoa:");
            System.out.printf("Nome: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.printf("Idade: ");
            int idade = input.nextInt();
            System.out.printf("Altura: ");
            double altura = input.nextDouble();
            pessoa[i] = new Altura(name, idade, altura);
            System.out.println();
        }

        double somaAltura = 0.0;
        for (int i = 0; i < pessoa.length; i++){
            somaAltura += pessoa[i].getAltura();
        }
        double mediaAltura = somaAltura/n;
        System.out.printf("Altura média: %.2f", mediaAltura);

        double porctDeCasaPessoa = 100/pessoa.length;
        double porctMenos16Anos = 0.0;
        for (int i = 0; i < pessoa.length; i++){
            if (pessoa[i].getIdade() < 16){
                porctMenos16Anos += porctDeCasaPessoa;
            }
        }
        System.out.printf("%nPessoas com menos de 16 anos: %.2f%% %n", porctMenos16Anos);
        for (int i = 0; i < pessoa.length; i++){
            if (pessoa[i].getIdade() < 16){
                System.out.println(pessoa[i].getName());
            }
        }
    }
}
