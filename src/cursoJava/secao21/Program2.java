package cursoJava.secao21;

import java.util.Arrays;

public class Program2 {

    public static int globalValue = 10;

    public static void main(String[] args) {

        int[] vect = new int[] { 3, 4, 5};
        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));
    }

    public static int[] changeOddValues(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0){
                numbers[i] += globalValue;
            }
        }
        return numbers;
    }
}
