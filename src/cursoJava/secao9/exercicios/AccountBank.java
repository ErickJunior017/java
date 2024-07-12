package cursoJava.secao9.exercicios;

public class AccountBank {
    private int numberAccount;
    private String name;
    private double amount;

    public AccountBank(double initialDeposit) {
        deposit(initialDeposit);
    }

    public AccountBank(int numberAccount, String name) {
        this.numberAccount = numberAccount;
        this.name = name;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double deposit){
        amount += deposit;
    }

    public void withDraw(double withDraw){
        amount -= withDraw + 5.00;
    }

    public String toString(){
        return "Account "
                + getNumberAccount()
                + ", Holder: "
                + getName()
                + String.format(", Balance: $%.2f", getAmount());
    }
}
