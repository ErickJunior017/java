package cursoJava.secao19.sec1;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.print  ("How many values? ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++){
            String value = input.next();
            ps.addValue(value);
        }

        ps.print();
        String x = ps.first();
        System.out.println("First: " + x);

        input.close();
    }
}
