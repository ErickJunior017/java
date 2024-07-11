package cursoJava.secao8.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Student student1 = new Student();

        System.out.print("Digite o nome do Aluno: ");
        student1.name = input.nextLine();
        System.out.println("\nDigite as três notas do aluno ");
        System.out.printf("Nota 1: ");
        student1.nota1 = input.nextDouble();

        System.out.printf("Nota 2: ");
        student1.nota2 = input.nextDouble();

        System.out.printf("Nota 3: ");
        student1.nota3 = input.nextDouble();

        System.out.printf("%nFinal Grade = %.2f", student1.notaFinal());
        System.out.printf(student1.result());
    }
}
