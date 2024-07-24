package cursoJava.secao13.application;

import cursoJava.secao13.entites.Department;
import cursoJava.secao13.entites.HourContract;
import cursoJava.secao13.entites.Worker;
import cursoJava.secao13.entites.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        SimpleDateFormat sqf = new SimpleDateFormat( "dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = input.nextLine();

        System.out.println("Enter worker data:");

        System.out.printf("Name: ");
        String name = input.nextLine();

        System.out.printf("Level: ");
        String level = input.nextLine();

        System.out.printf("Base salary: ");
        Double baseSalary = input.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));

        System.out.printf("%nHow many contracts to this worker? ");
        int quantCont = input.nextInt();

        System.out.println();
        for (int i = 0; i < quantCont; i++){
            System.out.printf("Enter contract #%d data: %n", i + 1);

            System.out.printf("Date (DD/MM/YYYY): ");
            input.nextLine();
            String data = input.nextLine();
            Date dataF = sqf.parse(data);

            System.out.printf("Value per hour: ");
            Double valuePerHour = input.nextDouble();

            System.out.printf("Duration (hours): ");
            Integer hours = input.nextInt();
            HourContract contract = new HourContract(dataF, hours, valuePerHour);
            worker.addContract(contract);

            System.out.println();
        }

        System.out.printf("Enter month and year to calculate income (MM/YYYY): ");
        String date = input.next();
        int month = Integer.parseInt(date.substring(0,2));
        int year = Integer.parseInt(date.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartament().getName());
        System.out.println("Income for " + date + ": " + String.format("R$ %.2f", worker.income(year, month)));
    }
}
