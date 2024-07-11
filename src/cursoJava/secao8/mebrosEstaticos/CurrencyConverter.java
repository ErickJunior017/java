package cursoJava.secao8.mebrosEstaticos;

public class CurrencyConverter {
    public static double VALOR_DOLAR, QUANTIDADE_DOLAR;

    public static double valorEmReais(){
        double valorEmReaisSemIOF =  VALOR_DOLAR * QUANTIDADE_DOLAR;
        return valorEmReaisSemIOF + valorEmReaisSemIOF * 0.06;
    }
}
