package cursoJava.secao15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        method1();
        System.out.println("End of program");
    }

    public static void method1(){
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");
    }

    public static void method2(){
        System.out.println("***METHOD2 START***");
        Scanner input = new Scanner(System.in);

        try{
            String[] vect = input.nextLine().split(" ");
            int position = input.nextInt();
            System.out.println(vect[position]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
            e.printStackTrace();
            input.next();
        }catch(InputMismatchException e){
            System.out.println("Input error!");
            input.next();
        }

        System.out.println("***METHOD2 END***");

        input.close();
    }
}
