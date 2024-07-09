package livroJAVA.capitulo5;

public class Juros {
    public static void main(String[] args) {
        double amount;
        double principal = 1000.0;
        double rate;

        for (int i = 5; i <= 10; i++) {
            rate = 1 + (i * 0.01);
            System.out.printf("%-4s%20s (juros %.0f porcento)%n", "Ano", "Valor depositado", (rate - 1) * 100);
            for (int year = 1; year <= 10; ++year) {
                amount = principal * Math.pow(rate, year);
                System.out.printf("%4d%,20.2f%n", year, amount);
            }
            System.out.println();
        }
    }
}
