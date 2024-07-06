package livroJAVA.capitulo3.exercicios;

import com.sun.source.tree.StringTemplateTree;

public class Data {
    private int dia, mes, ano;

    public Data(int d,int m,int a){
        dia = d;
        mes = m;
        ano = a;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getDia(){
        return dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getMes(){
        return mes;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return ano;
    }

    public String displayData(){
        return  String.format("%d/%d/%d", dia, mes, ano);
    }
}
