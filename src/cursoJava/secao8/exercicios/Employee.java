package cursoJava.secao8.exercicios;

public class Employee {
    public String name;
    public double grossSalary, tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void incrementSalary(double percentage){
        grossSalary += grossSalary * (percentage/100.0);
    }
}
