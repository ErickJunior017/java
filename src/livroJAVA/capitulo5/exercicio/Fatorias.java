package livroJAVA.capitulo5.exercicio;

public class Fatorias {
    public static void main(String[] args) {
        double fatorial;

        for (int i = 1; i <= 100; i++){
            fatorial = (double) i;
            for (int b = 1; b < i; b++){
                fatorial *=(double)  b;
            }
            System.out.printf("%nFatorial de %d = %.0f", i, fatorial);
        }
    }
}
