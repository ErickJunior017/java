package livroJAVA.capitulo3.exercicios;

public class Invoice {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Invoice(String num, String desc, double prec, int quant){
        numero = num;
        descricao = desc;
        preco = prec;
        quantidade = quant;
    }

    public void setNum_Product(String num){
        numero = num;
    }

    public String getNum_Product(){
        return numero;
    }

    public void setDescricao_Product(String desc){
        this.descricao = desc;
    }

    public String getDescricao_Product(){
        return descricao;
    }

    public void setValor(double prec){
        this.preco = prec;
    }

    public double getValor(){
        return preco;
    }

    public void setQuant(int quant){
        quantidade = quant;
    }

    public int getQuant(){
        return quantidade;
    }

    public double getInvoiceAmount(){
        return preco * quantidade;
    }
}
