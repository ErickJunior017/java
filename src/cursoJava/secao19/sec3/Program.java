package cursoJava.secao19.sec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Integer> myNumber = Arrays.asList(5, 2, 10);
        printList(myNumber);

        List<String> myStrs = Arrays.asList("Maria", "Erick", "Bob");
        printList(myStrs);
    }

    public static void printList(List<?> list){
        for (Object obj : list){
            System.out.println(obj);
        }
    }
}
