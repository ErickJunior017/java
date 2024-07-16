package cursoJava.secao10.aulas;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite um número: ");
        int n = input.nextInt();
        System.out.println();
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.printf("Digite um número: ");
                mat[i][j] = input.nextInt();
            }
        }

        System.out.println();
        System.out.print("Main diagonal: ");
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (i == j){
                    System.out.printf("%d ", mat[i][j]);
                }
            }
        }

        int qunatNegative = 0;
        System.out.print("\nNumbers negative: ");
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] < 0){
                   qunatNegative++;
                }
            }
        }
        System.out.printf("%d", qunatNegative);
        System.out.println();
    }
}
