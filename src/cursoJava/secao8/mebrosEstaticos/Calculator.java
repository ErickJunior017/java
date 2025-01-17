package cursoJava.secao8.mebrosEstaticos;

public class Calculator {

    public double radius;
    public final double PI = 3.14159;

    public double circuference(double radius){
        return 2 * PI * radius;
    }

    public double volume(double radius){
        return (4 * PI * Math.pow(radius, 3.0)) / 3;
    }
}
