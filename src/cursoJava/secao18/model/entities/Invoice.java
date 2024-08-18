package cursoJava.secao18.model.entities;

public class Invoice {
    private Double basicPayment;
    private Double taxt;

    public Invoice(){

    }

    public Invoice(Double basicPayment, Double taxt) {
        this.basicPayment = basicPayment;
        this.taxt = taxt;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTaxt() {
        return taxt;
    }

    public void setTaxt(Double taxt) {
        this.taxt = taxt;
    }

    public Double getTotalPayment(){
        return getBasicPayment() + getTaxt();
    }
}