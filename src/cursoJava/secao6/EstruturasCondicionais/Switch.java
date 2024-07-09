package cursoJava.secao6.EstruturasCondicionais;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int semana;

        System.out.printf("%nDigite o número que corresponde ao dia na semana (1 a 7): ");
        semana = input.nextInt();

        switch (semana){
            case 1:
                System.out.printf("%nDomingo");
                break;
            case 2:
                System.out.printf("%nSegunda");
                break;
            case 3:
                System.out.printf("%nTerça");
                break;
            case 4:
                System.out.printf("%nQuarta");
                break;
            case 5:
                System.out.printf("%nQuinta");
                break;
            case 6:
                System.out.printf("%nSexta");
                break;
            case 7:
                System.out.printf("%nSabado");
                break;
            default:
                System.out.printf("%nDia Inválido");
                break;
        }
    }
}
