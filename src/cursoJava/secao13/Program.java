package cursoJava.secao13;

import cursoJava.secao13.entites.Order;
import cursoJava.secao13.entites.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DElIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DElIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
