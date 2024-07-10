package cursoJava.secao7;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int higher = max(a, b, c);

        showResult(higher);
    }

    public static int max(int a, int b, int c){
        int aux;
         if (a > b && a > c){
            aux = a;
        } else if(b > c){
             aux = b;
        }
         else{
             aux = c;
        }
         return aux;
    }

    public static void showResult(int higher){
        System.out.printf("Higher is %d", higher);
    }
}
