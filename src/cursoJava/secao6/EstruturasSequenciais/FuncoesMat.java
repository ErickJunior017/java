package cursoJava.secao6.EstruturasSequenciais;

public class FuncoesMat {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double a, b , c;
        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);
        System.out.printf("Raiz quadrada de x = %.2f %n", a);
        System.out.printf("Raiz quadrada de y = %.2f %n", b);
        System.out.printf("Raiz quadrada de 25 = %.2f %n", c);

        a = Math.pow(x, y);
        b = Math.pow(y, 5.0);
        c = Math.pow(5.0, 8.0);
        System.out.printf("%.2f elevado a %.2f é = %.2f %n", x, y, a);
        System.out.printf("%.2f elevado a %.2f é = %.2f %n", x, 5.0, b);
        System.out.printf("%.2f elevado a %.2f é = %.2f %n", 5.0, 8.0, c);

        a = Math.abs(y);
        b = Math.abs(z);
        System.out.println("Valor absoluto de "+ y +" = " + a);
        System.out.println("Valor absoluto de "+ z +" = " + b +"\n\n");

        double delta = Math.pow(b, 2.0) - 4 * a * c;
        double x1 = (+Math.sqrt(delta)  -b) / (2.0 * a);
        double x2 = (-Math.sqrt(delta)  -b) / (2.0 * a);

        double raio = 4.0;
        double areaCirculo =Math.PI * Math.pow(raio, 2.0);
        System.out.println((int)areaCirculo);
    }
}
