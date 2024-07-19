package cursoJava.secao11;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);

        int minutes = cal.get(Calendar.MINUTE);
        int mes = 1 + cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int hours = 3 + cal.get( Calendar.HOUR_OF_DAY);

        System.out.println("Minutes: " + minutes);
        System.out.println("MONTH: " + mes);
        System.out.println("YEAR: " + year);
        System.out.println("HOURS: " + hours);
    }
}