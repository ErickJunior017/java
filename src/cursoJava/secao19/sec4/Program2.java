package cursoJava.secao19.sec4;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        List<Object> myOjs = new ArrayList<>();
        myOjs.add("Maria");
        myOjs.add("Alex");

        List<? super Number>  myNums = myOjs;

        myNums.add(10);
        myNums.add(3.14);

        Number x = myNums.get(0); //erro de compilação/
    }
}
