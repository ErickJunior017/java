package cursoJava.secao14.entities2;

import cursoJava.secao14.entities2.enume.Color;

public class Rectangle extends Shape{
    private Double width;
    private Double height;

    public Rectangle(){
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }


    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return height * width;
    }
}
