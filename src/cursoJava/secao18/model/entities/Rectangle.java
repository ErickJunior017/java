package cursoJava.secao18.model.entities;

import cursoJava.secao18.model.enums.Color;

public class Rectangle extends AbstractShape{

    private double widht;
    private double height;

    public Rectangle(Color color, double widht, double height){
        super(color);
        this.widht = widht;
        this.height = height;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area(){
        return getWidht() * getHeight();
    }
}
