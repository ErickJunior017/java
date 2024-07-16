package cursoJava.secao10.aulas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Erick");
        list.add("Ana");
        list.add("Livia");
        list.add("Andre");
        list.add("Luis");
        list.add("Amanda");
        list.add("Maria");
        list.add(2, "Kaick");

        for (String name : list){
            System.out.println(name);
        }
        System.out.println(list.size());

        System.out.println("--------------------");
        list.removeIf(name -> name.charAt(0) == 'A');
        for (String name : list){
            System.out.println(name);
        }
        System.out.println("--------------------");

        System.out.println("Index of Erick: "+ list.indexOf("Erick"));
        System.out.println("Index of Kaick: "+ list.indexOf("Kaick"));
        System.out.println("Index of Livia: "+ list.indexOf("Livia"));
        System.out.println("Index of Luis: " + list.indexOf("Luis"));
        System.out.println("Index of Maria: "+ list.indexOf("Maria"));
        System.out.println(list.size());
        System.out.println("--------------------");
        List<String> result = list.stream().filter(name -> name.charAt(0) == 'E').collect(Collectors.toList());
        for (String name : result){
            System.out.println(name);
        }

        result.add("Ana");
        result.add("Pedro");
        result.add("Emily");
        result.add("Antonio");
        result.add("Amanda");
        result.add("Aline");
        result.add("Pietro");

        result = result.stream().filter(name -> name.charAt(0) == 'A').collect(Collectors.toList());
        System.out.println("--------------------");
        for (String name : result){
            System.out.println(name);
        }
        System.out.println("--------------------");
        list.add("Ana");
        list.add("Amanda");
        String name2 = list.stream().filter(name3 -> name3.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name2);
    }
}
