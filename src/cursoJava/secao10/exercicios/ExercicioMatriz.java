package cursoJava.secao10.exercicios;

import java.util.Scanner;

public class ExercicioMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Número de linhas: ");
        int n = input.nextInt();

        System.out.print("Número de Colunas: ");
        int m = input.nextInt();

        int[][] mat = new int[n][m];
        System.out.println();
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = input.nextInt();
            }
        }

        int x = input.nextInt();

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }

        input.close();
    }
}
