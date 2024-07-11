package cursoJava.secao8.mebrosEstaticos;


import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.printf("What is the dollar price? ");
        CurrencyConverter.VALOR_DOLAR = input.nextDouble();
        System.out.printf("How many dollars will be bought? ");
        CurrencyConverter.QUANTIDADE_DOLAR = input.nextDouble();
        System.out.printf("Amount to be paid is reais = R$%.2f", CurrencyConverter.valorEmReais());
    }
}
