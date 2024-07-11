package cursoJava.secao8.exercicios;

public class Rectangle {
    public double height;
    public double width;

    public double area(){
        return height * width;
    }

    public double perimetro(){
        return (2 * height) + (2 * width);
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(height, 2.0) + Math.pow(width, 2.0));
    }
}
