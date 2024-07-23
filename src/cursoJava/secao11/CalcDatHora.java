package cursoJava.secao11;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalcDatHora {
    public static void main(String[] args) {
        //https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/time/format/DateTimeFormatter.html

        LocalDate d04 = LocalDate.parse("2024-07-16");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-16T21:29:26");
        Instant d06 = Instant.parse("2024-07-16T21:29:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        LocalDate nextYearLocalDate = nextWeekLocalDate.plusYears(1);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime pastHoursDateTime = d05.plusHours(10);
        LocalDateTime plusMinutesLocalDateTime = d05.plusMinutes(7);
        LocalDateTime plusSecondsLocalDateTime = d05.plusSeconds(30);

        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);

        System.out.println("d04 = "+d04);
        System.out.println("Past Week = "+ pastWeekLocalDate);
        System.out.println("Next Week = " + nextWeekLocalDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Next Year and Next Week = "+ nextYearLocalDate);
        System.out.println();
        System.out.println("d05 = "+d05);
        System.out.println("Menos 10 Horas = "+ pastHoursDateTime);
        System.out.println("Mais 7 Minutos = "+ plusMinutesLocalDateTime);
        System.out.println("Mais 30 Seconds = "+ plusSecondsLocalDateTime);
        System.out.println();
        System.out.println("Next Week Instant = "+nextWeekInstant);
        System.out.println("past Week Instant = "+pastWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);


        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
    }
}

