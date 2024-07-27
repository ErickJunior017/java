package cursoJava.secao14.exercicios.aplication;

import cursoJava.secao14.exercicios.entities.Company;
import cursoJava.secao14.exercicios.entities.Individual;
import cursoJava.secao14.exercicios.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int quantity = input.nextInt();
        System.out.println();

        for (int i = 0; i < quantity; i++){
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char person = input.next().charAt(0);
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = input.nextDouble();
            if (person == 'i'){
                System.out.print("Health expenditures: ");
                Double helthExpenditures = input.nextDouble();
                list.add(new Individual(name, anualIncome, helthExpenditures));
            }else {
                System.out.print("Number of employees: ");
                int quantityEmployees = input.nextInt();
                list.add(new Company(name, anualIncome, quantityEmployees));
            }
            System.out.println();
        }

        double totalTax = 0.0;
        System.out.println("TAXES PAID:");
        for (TaxPayer tp : list){
            System.out.printf("%s: $%.2f", tp.getName(), tp.tax());
            System.out.println();
            totalTax += tp.tax();
        }

        System.out.printf("%nTOTAL TAXES: $%.2f", totalTax);
    }
}
