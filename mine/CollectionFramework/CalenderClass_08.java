
import java.util.Calendar;
import java.util.TimeZone;

public class CalenderClass_08 {
    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        
        Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("America/Chicago"));
        System.out.println(c2.getCalendarType());
        System.out.println(c2.getTimeZone().getID());

        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" +  c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    }
}
