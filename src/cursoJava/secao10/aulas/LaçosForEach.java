package cursoJava.secao10.aulas;

public class LaçosForEach {
    public static void main(String[] args) {
        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        for (String name: vect){
            System.out.println(name);
        }
    }
}
