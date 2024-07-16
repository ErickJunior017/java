package cursoJava.secao10.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FuncionariosTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

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

            Funcionario emp = new Funcionario(id, name, salario);
            list.add(emp);
        }
        System.out.println();
        System.out.printf("Enter the employee id that will have salary increase: ");
        int idSalary = input.nextInt();
        Integer pos = position(list, idSalary);
        if (pos == null){
            System.out.println("This id doesn't exist!");
        }else {
            System.out.print("Enter the percentage: ");
            double percent = input.nextDouble();
            list.get(pos).icrementSalary(percent);
        }
        System.out.println();
        System.out.println("List of employees:");
        for (Funcionario list2 : list){
            System.out.println(list2);
        }
    }
    public static Integer position(List<Funcionario> list, int id){
        for (int i = 0; i< list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
