package cursoJava.secao18.model.service;

import cursoJava.secao18.model.entities.CarRentel;
import cursoJava.secao18.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private double pricePerDay;
    private double pricePerHour;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService){
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRentel carRentel){
        double minutes = Duration.between(carRentel.getStart(), carRentel.getFinish()).toMinutes();
        double hours = minutes/60;

        double basicPayment;
        if (hours <= 12.0){
            basicPayment = pricePerHour * Math.ceil(hours);
        }else {
            basicPayment = pricePerDay * Math.ceil(hours/24.0);
        }
        double tax = taxService.tax(basicPayment);

        carRentel.setInvoice(new Invoice(basicPayment, tax));
    }
}
