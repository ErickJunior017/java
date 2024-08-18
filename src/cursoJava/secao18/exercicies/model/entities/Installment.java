package cursoJava.secao18.exercicies.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    private LocalDate dueDate;
    private Double amount;

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public String toString(){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return df.format(getDueDate()) + " - " + String.format("R$%.2f", getAmount()) ;
    }
}
