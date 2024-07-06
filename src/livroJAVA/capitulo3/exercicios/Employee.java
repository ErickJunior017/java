package livroJAVA.capitulo3.exercicios;

public class Employee {
    private String nome, sobrenome;
    private double salario;

    public Employee(String nome, String sobrenome, double sal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (sal > 0) {
            salario = sal;
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSobreNome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getSobreNome(){
        return sobrenome;
    }

    public void setSalario(double sal){
        salario = sal;
    }

    public double getSalario(){
        return salario;
    }

    public double aumento(){
        return salario * 1.10;
    }
}
