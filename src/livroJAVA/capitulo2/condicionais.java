package livroJAVA.capitulo2;

import java.util.Scanner;//Programa utilizado para ler números
//comparando dois números inteiros
//condicionais

public class condicionais {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1, number2;
        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        System.out.print("Enter secund number: ");
        number2 = input.nextInt();
        if (number1 == number2){
            System.out.printf("%d = %d", number1, number2);
        }

        if (number1 != number2){
            System.out.printf("%d != %d", number1, number2);
        }

        if (number1 < number2){
            System.out.printf("%d < %d", number1, number2);
        }

        if (number1 > number2){
            System.out.printf("%d > %d", number1, number2);
        }

        if (number1 <= number2){
            System.out.printf("%d <= %d", number1, number2);
        }

        if (number1 >= number2){
            System.out.printf("%d >= %d", number1, number2);
        }

        if(number1 != 7)
        {
            System.out.printf("%d é diferente de zero", number1);
        }else {
            System.out.printf("%d é diferente de zero1", number1);
        }
    }
}
