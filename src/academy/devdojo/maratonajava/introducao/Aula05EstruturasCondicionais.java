package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 10;
        boolean isAutorizado = idade >= 18;
        if (isAutorizado){
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        if (!isAutorizado){
            System.out.println("Não autorizado a comprar bebida");
        }
        boolean c = false;
        if (c = true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        double dinheiroParaCarro = 1000000;
        if (dinheiroParaCarro == 1000000){
            System.out.println("Comprar uma Porche");
        } else{
            System.out.println("Comprar um Gol");
        }
    }
}
