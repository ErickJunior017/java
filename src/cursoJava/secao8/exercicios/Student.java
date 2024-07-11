package cursoJava.secao8.exercicios;

public class Student {
    public String name;
    public double nota1, nota2, nota3;

    public double notaFinal(){
        return nota1 + nota2 + nota3;
    }

    public String result(){
        if(notaFinal() < 60.00){
            return "\nFailed \nMISSING " + (- notaFinal() + 60.00) + " POINTS\n";
        }else {
            return "\nPASS";
        }
    }
}
