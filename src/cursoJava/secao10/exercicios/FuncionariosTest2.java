package cursoJava.secao10.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FuncionariosTest2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Funcionario2> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int quantidade = input.nextInt();
        for (int i = 0; i < quantidade; i++){
            System.out.println();
            System.out.println("Emplyoee #"+(i + 1)+":");
            System.out.print("Id: ");
            Integer id = input.nextInt();
            System.out.printf("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.printf("Salary: ");
            Double salario = input.nextDouble();

            Funcionario2 emp = new Funcionario2(id, name, salario);
            list.add(emp);
        }
        System.out.println();
        System.out.printf("Enter the employee id that will have salary increase: ");
        int idSalary = input.nextInt();
        Funcionario2 emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        if (emp == null){
            System.out.println("This id doesn't exist!");
        }else {
            System.out.print("Enter the percentage: ");
            double percent = input.nextDouble();
            emp.icrementSalary(percent);
        }
        System.out.println();
        System.out.println("List of employees:");
        for (Funcionario2 list2 : list){
            System.out.println(list2);
        }
    }
}
