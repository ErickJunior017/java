package cursoJava.secao7;

import java.util.Scanner;

public class OperadorBitwise {
    public static void main(String[] args) {
        /*
        * Usadao na programação de baixo nivel
        * */
        Scanner input = new Scanner(System.in);
        int mask = 0b100000;
        int n = input.nextInt();
        if ((n & mask) != 0){
            System.out.println("6th bit is 1");
        }else {
            System.out.println("6th bit is 0, so ");
        }
    }
}
