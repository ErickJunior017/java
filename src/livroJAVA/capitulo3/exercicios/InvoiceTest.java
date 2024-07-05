package livroJAVA.capitulo3.exercicios;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Invoice compras = new Invoice("1", "Processador i9 14900k", 4000.0,4);

        System.out.printf("%nNumero: %s %nDescrição: %s %nValor: R$%.2f %nQuantidade: %d %n%n",
                compras.getNum_Product(),
                compras.getDescricao_Product(),
                compras.getValor(),
                compras.getQuant());
    }
}
