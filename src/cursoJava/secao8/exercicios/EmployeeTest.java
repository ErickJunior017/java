package cursoJava.secao8.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Employee funcionario1 = new Employee();

        System.out.printf("%nName: ");
        funcionario1.name = input.nextLine();
        System.out.printf("Gross salary: ");
        funcionario1.grossSalary = input.nextDouble();
        System.out.printf("Tax: ");
        funcionario1.tax = input.nextDouble();
        System.out.printf("%nEmployee: %s, $%.2f", funcionario1.name, funcionario1.netSalary());
        System.out.printf("%n%nWhich percentage to increase salary?: ");
        double percent = input.nextDouble();
        funcionario1.incrementSalary(percent);
        System.out.printf("%nUpdated data: %s, $%.2f %n", funcionario1.name, funcionario1.netSalary());
    }
}
