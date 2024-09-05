package cursoJava.secao19.set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program2 {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //união
        //addAll vai adicionar todos os elementos de uma lista para a outra;
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //interceção
        //retainAll vai adicionar somente os elementos que tem em comum no elemento
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //diferença
        //removeAll vai remover somente os elementos em A que tem em comum em B
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
