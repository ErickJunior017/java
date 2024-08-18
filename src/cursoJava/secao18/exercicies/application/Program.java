package cursoJava.secao18.exercicies.application;

import cursoJava.secao18.exercicies.model.entities.Contract;
import cursoJava.secao18.exercicies.model.entities.Installment;
import cursoJava.secao18.exercicies.model.service.ContractService;
import cursoJava.secao18.exercicies.model.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = input.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        input.nextLine();
        LocalDate ldt = LocalDate.parse(input.nextLine(), df);

        System.out.print("Valor do contrato: ");
        double totalAmount = input.nextDouble();
        Contract contract = new Contract(number, ldt, totalAmount);

        System.out.print("Entre com o numero de parcelas: ");
        int parcelas = input.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, parcelas);

        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }
        System.out.printf("%nTotal: R$%.2f", contractService.getTotal());
        input.close();
    }
}
