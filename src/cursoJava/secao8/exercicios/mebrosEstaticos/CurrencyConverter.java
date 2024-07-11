package cursoJava.secao8.exercicios.mebrosEstaticos;

public class CurrencyConverter {
    public static double VALOR_DOLAR, QUANTIDADE_DOLAR;

    public static void quantidade(double quantidadeDolar){
        QUANTIDADE_DOLAR = quantidadeDolar;
    }

    public double valorEmReais(){
        return VALOR_DOLAR * QUANTIDADE_DOLAR * 0.06;
    }
}
