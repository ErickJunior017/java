package livroJAVA.capitulo5.exercicio;
import java.util.Scanner;
public class AsteriskChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        // Lê os cinco números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número entre 1 e 30: ");
            numbers[i] = input.nextInt();
        }

        // Exibe os asteriscos
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < numbers[i]; j++) {
                System.out.print("*");
            }
            System.out.println(); // Pula para a próxima linha
        }
    }
}
