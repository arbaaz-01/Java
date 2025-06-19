import java.util.Date;

public class DateClass_07 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("Date: " + d);

        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear() + 1900);
    }
}
