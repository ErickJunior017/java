package cursoJava.secao18.exercicies.model.service;

import cursoJava.secao18.exercicies.model.entities.Contract;
import cursoJava.secao18.exercicies.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService paymentService;
    private double total;
    public ContractService(OnlinePaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months){
        for (int i = 1; i <= months; i++){
            LocalDate lct = contract.getDate().plusMonths(i);
            double amount = contract.getTotalValue() / months;
            amount += paymentService.interest(amount, i);
            amount += paymentService.paymentFee(amount);
            total(amount);
            contract.getInstallments().add(new Installment(lct, amount));
        }
    }

    public void total(double amount){

        total += amount;
    }

    public double getTotal(){
        return total;
    }
}
