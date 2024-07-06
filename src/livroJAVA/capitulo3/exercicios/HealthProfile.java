package livroJAVA.capitulo3.exercicios;

public class HealthProfile {
    private String nome;
    private int dia, mes, ano;

    public HealthProfile(String nome, int dia, int mes, int ano){
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getNome(){
        return nome;
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }

    public int idade(){
        return   2024 - ano;
    }

    public int frequenciaMax(){
        return 220 - idade();
    }

    public double frequenciaAlvo(){
        return  frequenciaMax() * 0.80;
    }
}
