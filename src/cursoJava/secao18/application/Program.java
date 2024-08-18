package cursoJava.secao18.application;

import cursoJava.secao18.model.entities.CarRentel;
import cursoJava.secao18.model.entities.Invoice;
import cursoJava.secao18.model.entities.Vehicle;
import cursoJava.secao18.model.service.BrazilTaxService;
import cursoJava.secao18.model.service.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = input.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(input.nextLine(), dft);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(input.nextLine(), dft);

        CarRentel cr = new CarRentel(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = input.nextDouble();
        System.out.print("Entre como preço por dia: ");
        double pricePerDay = input.nextDouble();

        RentalService rs = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rs.processInvoice(cr);

        System.out.println("Fatura:");
        System.out.println("Pagamento basico: " + String.format("R$%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("R$%.2f", cr.getInvoice().getTaxt()));
        System.out.println("Pagamento total: " +String.format("R$%.2f", cr.getInvoice().getTotalPayment()));

        input.close();
    }
}
