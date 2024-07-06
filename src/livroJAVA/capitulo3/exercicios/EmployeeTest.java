package livroJAVA.capitulo3.exercicios;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee funcionario1 = new Employee("Erick", "Junior", 550000.0);
        Employee funcionario2 = new Employee("Ana", "Lyvia", 720000.00);

        System.out.printf("%nFuncionario1 %nNome: %s %nSobrenome: %s %nSalário Anual: R$%.2f %n%n",
                funcionario1.getNome(),
                funcionario1.getSobreNome(),
                funcionario1.getSalario());

        System.out.printf("%nFuncionario2 %nNome: %s %nSobrenome: %s %nSalário Anual: R$%.2f %n%n",
                funcionario2.getNome(),
                funcionario2.getSobreNome(),
                funcionario2.getSalario());

        System.out.println("-----------------------------------------------");
        System.out.printf("Salário Anual depois do aumento de 10 porcento %n");
        System.out.printf("Funcionario1: R$%.2f %n", funcionario1.aumento());
        System.out.printf("Funcionario2: R$%.2f %n%n", funcionario2.aumento());
    }
}
