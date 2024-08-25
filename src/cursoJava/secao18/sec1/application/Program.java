package cursoJava.secao18.sec1.application;

import cursoJava.secao18.sec1.devices.ComboDevice;
import cursoJava.secao18.sec1.devices.ConcretePrinter;
import cursoJava.secao18.sec1.devices.ConcreteScanner;

public class Program {
    public static void main(String[] args) {
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2023");
        s.processDoc("My email");
        System.out.println("Scan result: " + s.scan());
        System.out.println();

        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}
