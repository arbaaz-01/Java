import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_10 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();     // This is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/mm/yyyy --E H:m:s a");  // Creating date string using date and format
        String myDate = dt.format(df);
        System.out.println(myDate);

        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate2 = dt.format(df2);
        System.out.println(myDate2);

        DateTimeFormatter df3 = DateTimeFormatter.ISO_LOCAL_TIME;
        String myDate3 = dt.format(df3);
        System.out.println(myDate3);
    }
}
