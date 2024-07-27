package cursoJava.secao14.entities2;

import cursoJava.secao14.entities2.enume.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int quantity = input.nextInt();
        System.out.println();
        for (int i = 0; i < quantity; i++){
            System.out.println("Shape #" + i + 1 + " Data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char form = input.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            input.nextLine();
            String color = input.nextLine();
            if (form == 'c'){
                System.out.print("Radius: ");
                double radius = input.nextDouble();
                list.add(new Circle(Color.valueOf(color), radius));
            }else {
                System.out.print("Width: ");
                double width = input.nextDouble();
                System.out.print("Height: ");
                double height = input.nextDouble();
                list.add(new Rectangle(Color.valueOf(color), width, height));
            }
            System.out.println();
        }

        System.out.println("SHAPE AREAS:");
        for (Shape shape : list){
            System.out.printf("%.2f", shape.area());
            System.out.println();
        }

    }
}
