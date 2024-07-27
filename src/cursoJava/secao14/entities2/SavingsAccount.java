package cursoJava.secao14.entities2;

public class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    //@Override é responsavel por indica ao compilador que o metodo abaixo é sobrescrito.
    // É uma boa pratica de programação
    @Override
    public final  void  withDraw(Double amount){
        balance -= amount;
    }
}