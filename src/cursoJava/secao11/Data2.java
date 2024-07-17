package cursoJava.secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Data2 {
    public static void main(String[] args) {
        //https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/time/format/DateTimeFormatter.html

        LocalDate d04 = LocalDate.parse("2024-07-16");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-16T21:29:26");
        Instant d06 = Instant.parse("2024-07-16T21:29:26Z");
        Instant d07 = Instant.now();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_INSTANT;

        String d07Text = fmt4.format(d07);


        System.out.println("d04 = "+ d04.format(fmt1));
        System.out.println("d04 = "+ fmt1.format(d04));
        System.out.println("d04 = "+ d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println();
        System.out.println("d05 = "+ d05.format(fmt1));
        System.out.println("d05 = "+ d05.format(fmt2));
        System.out.println();
        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println();
        System.out.println("d07 = " + d07Text);
        System.out.println();
        System.out.println("d05 = "+ d05.format(fmt5));
        System.out.println("d06 = " + fmt6.format(d06));
        System.out.println("d06 = " + d06.toString());
    }
}

