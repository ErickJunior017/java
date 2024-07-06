package livroJAVA.capitulo3.exercicios;

public class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile cardio = new HealthProfile("Erick Junior", 12, 12, 2006);

        System.out.printf("%nNome: %s %nIdade: %d %nFrequência Máxima: %d %nFrequência Alvo: %.2f %n%n",
                cardio.getNome(),
                cardio.idade(),
                cardio.frequenciaMax(),
                cardio.frequenciaAlvo());
    }
}
