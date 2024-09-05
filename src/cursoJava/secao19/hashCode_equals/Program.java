package cursoJava.secao19.hashCode_equals;

import cursoJava.secao19.hashCode_equals.application.Cliente;

public class Program {
    public static void main(String[] args) {


        Cliente c1 = new Cliente("Maria", "maria@gmail.com");
        Cliente c2 = new Cliente("Maria", "maria@gmail.com");

        String s1 = new String("Maria");
        String s2 = new String("Maria");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c1));

        // equals vai comparar o conteudo
        System.out.println(s1.equals(s2));
        // == vai comparar a instancia
        System.out.println(s1 == s2);
    }
}
