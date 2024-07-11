package cursoJava.secao8.exercicios.mebrosEstaticos;

public class CalculatorStatic {
        public static final double PI = 3.14159;

        public static double circuference(double radius){
            return 2 * PI * radius;
        }

        public static double volume(double radius){
            return (4 * PI * Math.pow(radius, 3.0)) / 3;
        }
    }