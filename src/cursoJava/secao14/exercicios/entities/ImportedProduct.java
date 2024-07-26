package cursoJava.secao14.exercicios.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + " $" + String.format("%.2f",totalPrice()));
        sb.append(" (Customs fee: $" + String.format("%.2f", getCustomsFee()) + ")");
        return sb.toString();
    }
}
