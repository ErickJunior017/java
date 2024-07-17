package cursoJava.secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Data3 {
    public static void main(String[] args) {
        //https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/time/format/DateTimeFormatter.html

        LocalDate d04 = LocalDate.parse("2024-07-16");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-16T21:29:26");
        Instant d06 = Instant.parse("2024-07-16T21:29:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDate r3 = LocalDate.ofInstant(d06, ZoneId.of("Japan"));
        LocalDate r4 = LocalDate.ofInstant(d06, ZoneId.of("Asia/Chungking"));
        LocalDateTime r5 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r6 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());

        System.out.println("Brazil = "+ r1);
        System.out.println("Portugal = "+ r2);
        System.out.println("Japan = "+ r3);
        System.out.println("Chungking = "+ r4);
        System.out.println("Portugal Time = " + r5);
        System.out.println("Brazil Time = " + r6);
        System.out.println("d04 dia = "+ d04.getDayOfMonth());
        System.out.println("d04 mês = "+ d04.getMonth());
        System.out.println("d04 mês = "+ d04.getMonthValue());
        System.out.println("d04 mês = "+ d04.getYear());
        System.out.println("d05 hours = "+ d05.getHour());
        System.out.println("d05 Minutes = "+ d05.getMinute());
    }
}

