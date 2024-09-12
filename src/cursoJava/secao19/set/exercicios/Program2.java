package cursoJava.secao19.set.exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many students for course A? ");
        int quantity = input.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < quantity; i++){

            int code = input.nextInt();
            set.add(code);
        }

        System.out.print("How many students for course B? ");
        quantity = input.nextInt();
        for (int i = 0; i < quantity; i++){

            int code = input.nextInt();
            set.add(code);
        }

        System.out.print("How many students for course C? ");
        quantity = input.nextInt();
        for (int i = 0; i < quantity; i++){

            int code = input.nextInt();

            set.add(code);
        }

        System.out.println("Total students: " + set.size());

        input.close();
    }
}
