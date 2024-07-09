package livroJAVA.capitulo5.exercicio;

public class SomaImpar {
    public static void main(String[] args) {
        int  somaImpares = 0;

        for (int i = 1; i <= 15; i++){
            if (i % 2 == 1){
                somaImpares += i;
            }
        }
        System.out.printf("%nA Soma dos números impares de 1 a 15: %d %n", somaImpares);
    }
}
