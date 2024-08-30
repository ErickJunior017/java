package cursoJava.secao19.sec4;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Shape> myShape = new ArrayList<>();
        myShape.add(new Rectangle(3.0, 2.0));
        myShape.add(new Circle(2.0));

        List<Circle> myCircle = new ArrayList<>();
        myCircle.add(new Circle(2.0));
        myCircle.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircle));
    }

    //List<? extends Shape> area diz que o metodo vai aceita Shape e qualquer subtipo de Shape
    public static double totalArea(List<? extends Shape> area){
        double sum = 0;
        for (Shape areas : area){
            sum += areas.area();
        }
        return sum;
    }
}
