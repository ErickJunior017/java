package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // int, double, float, char, byte, short, long, boolean
        boolean verdadeiro = true;
        boolean falso = false;
        char charactere = '\u0041';
        byte idadeByte = 127;
        short idadeShort = 10;
        int idade = (int)100000000000L;
        long numeroGrande = (long)1000000.155;
        float salarioFloat = (float)2500.0d;
        double salarioDouble = 2000.0d;
        String nome = "Erick";
        String nome2 = "Vegeta";

        System.out.println("Age is "+idade+" anos");
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(charactere);
        System.out.println(idadeShort);
        System.out.println(numeroGrande);
        System.out.println("Meu nome é "+nome);

    }
}
