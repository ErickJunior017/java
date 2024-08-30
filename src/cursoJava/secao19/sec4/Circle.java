package cursoJava.secao19.sec4;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.pow(getRadius(), 2) * Math.PI;
    }
}
