package cursoJava.secao19.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program1 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        //HashSet é o mais rapido de todos porem não garante a ordem.
        //TreeSet garante a ordem por ordem alfabética
        //LinkedHashSet mantem a ordem que os elementos foram inseridos
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");


        //operação add adiciona elementos. contains() verifica se set contem o elemento. remove() remove elementos
        //removeIf() vai remover os elementos que satisfazerem o predicato
        set.removeIf(x -> x.charAt(0) == 'T');

        for(String p : set){
            System.out.println(p);
        }
    }
}
