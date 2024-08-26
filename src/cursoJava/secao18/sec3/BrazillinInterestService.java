package cursoJava.secao18.sec3;

import java.security.InvalidParameterException;

public class BrazillinInterestService implements InterestService{
    private Double interestRate;

    public BrazillinInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
