package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula04Operaoderes {
    public static void main(String[] args){
        double n01 = 10;
        double n02 = 20;
        double soma = n01 + n02;
        double divisor = n01 / n02;
        System.out.println(divisor);

        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= != ==
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 10;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte "+isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte "+isDezDiferenteQueVinte);

        // && (And) || (Or) ! (Not)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaleiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaleiMaiorQueTrinta "+isDentroDaleiMaiorQueTrinta);
        System.out.println("isDentroDaleiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTOtalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTOtalContaPoupanca > valorPlaystation;
        System.out.println("Playstation é compravel?: "+isPlaystationCincoCompravel);

    // = += -= *= /= %=
        double bonus = 1800;
        bonus += 200;
        bonus -= 1000;
        bonus *= 4;
        bonus /= 2;
        bonus %= 7;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;
        contador ++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(++contador2);

    }
}