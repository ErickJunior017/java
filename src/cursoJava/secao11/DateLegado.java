package cursoJava.secao11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class DateLegado {
    public static void main(String[] args) throws ParseException {
        //Formato: yyyy-MM-ddTHH:mm:ssZ
        //Exemplo: 2024-07-17T00:49:56Z
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = sdf1.parse("25/06/2024");
        Date y2 = sdf2.parse("25/06/2024 15:27:07");

        System.out.println("y1: " + sdf1.parse("25/06/2024"));
        System.out.println("y2: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
    }
}
