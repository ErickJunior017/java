package cursoJava.secao14.exercicios.aplication;

import cursoJava.secao14.exercicios.entities.Employee;
import cursoJava.secao14.exercicios.entities.OutsourcedEmployee;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);



        System.out.print("Enter the number of employees: ");
        int quantity = input.nextInt();
        List<Employee> employee = new ArrayList<>();
        System.out.println();

        for (int i = 0; i < quantity; i++){
            System.out.println("Employee #" + i +1 + " data:");
            System.out.print("Outsourced (y/n)? ");
            char outsourced = input.next().charAt(0);
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Hours: ");
            int hours = input.nextInt();
            System.out.print("Value per hour: ");
            Double valueHour = input.nextDouble();
            if (outsourced == 'y'){
                System.out.print("Additional charge: ");
                Double additionalCharge = input.nextDouble();
                employee.add(new OutsourcedEmployee(name, hours, valueHour, additionalCharge));
            }else{
                employee.add(new Employee(name, hours, valueHour));
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : employee){
            System.out.println(emp);
        }
    }
}
