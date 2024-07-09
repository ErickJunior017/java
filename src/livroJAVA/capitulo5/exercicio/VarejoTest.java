package livroJAVA.capitulo5.exercicio;

import java.util.Scanner;

public class VarejoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  quantidade;
        double valorTotal = 0;
        double produto1 = 2.98;
        double produto2 = 4.50;
        double produto3 = 9.98;
        double produto4 = 4.49;
        double produto5 = 6.87;
        int i = 1;
        while(i <= 5){
            int numero = i;
            System.out.printf("%nProduto %d ", i);
            System.out.printf("%nQuantidade comprada: ");
            quantidade = input.nextInt();
            switch (numero){
                case 1:
                    valorTotal += (produto1 * quantidade);
                    break;
                case 2:
                    valorTotal += (produto2 * quantidade);
                    break;
                case 3:
                    valorTotal += (produto3 * quantidade);
                    break;
                case 4:
                    valorTotal += (produto4 * quantidade);
                    break;
                default:
                    valorTotal += (produto5 * quantidade);
            }
            i++;
        }
        System.out.printf("%nO valor total da compra é R$%.2f", valorTotal);
    }
}
