package livroJAVA.capitulo3.exercicios;


import java.io.PrintStream;

public class Account4 {
    private String name;
    private double balance;

    public Account4(String name, double balance){
        this.name = name;

        if (balance > 0.0){
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }

    public double getBalance(){
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void withDraw(double withDraw){
        if(withDraw > 0) {
            balance = balance - withDraw;
        }
    }

}
