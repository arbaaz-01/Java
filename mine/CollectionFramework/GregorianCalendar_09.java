import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalendar_09 {
    public static void main(String[] args) {
        
        GregorianCalendar c = new GregorianCalendar();
        System.out.println(c.isLeapYear(2000));

        for(int i=0; i<629; i++){
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
        
    }
}
