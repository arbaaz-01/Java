import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

import javax.xml.transform.Source;

import java.util.Date;
public class _02 {
    public static void main(String[] args) {
        
        Date d = new Date();
        System.out.println(d);

        System.out.println(d.getHours() +":"+d.getMinutes()+":"+d.getSeconds());

        System.out.println("\nCalendar Class");
        Calendar cl = Calendar.getInstance();
        // System.out.println(cl);

        
        // System.out.println(Calendar.HOUR+":"+Calendar.MINUTE+":"+Calendar.SECOND);
        System.out.println(cl.get(Calendar.HOUR_OF_DAY)+":"+cl.get(Calendar.MINUTE)+":"+cl.get(Calendar.SECOND));


        System.out.println("\nJava time API");
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        
        String date = dt.format(df);
        System.out.println(date);

    }
}
