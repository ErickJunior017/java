package cursoJava.secao18.model.entities;

import cursoJava.secao18.model.enums.Color;

public class Circle extends AbstractShape{
    private double radius;

    public Circle(Color color, double radius){
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(getRadius(), 2);
    }
}

