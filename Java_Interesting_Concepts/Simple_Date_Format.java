import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Simple_Date_Format {

    public static void main(String[] args) {
        // Create a SimpleDateFormat instance with a specific pattern
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Define a date string in the same pattern
        String dateString = "25/12/2023";

        try {
            // Parse the date string into a Date object
            Date date = sdf.parse(dateString);
            System.out.println("Parsed Date: " + date);

            // Format the Date object back into a string
            String formattedDate = sdf.format(date);
            System.out.println("Formatted Date: " + formattedDate);

        } catch (ParseException e) {
            // Handle the ParseException if the date string is not in the expected format
            System.out.println("ParseException: " + e.getMessage());
        }

        // Demonstrate different date formats
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat sdf3 = new SimpleDateFormat("E, MMM dd yyyy");

        try {
            Date date = sdf.parse(dateString);

            // Format the Date object into different string formats
            System.out.println("Formatted Date (yyyy-MM-dd): " + sdf1.format(date));
            System.out.println("Formatted Date (dd-MMM-yyyy): " + sdf2.format(date));
            System.out.println("Formatted Date (E, MMM dd yyyy): " + sdf3.format(date));

        } catch (ParseException e) {
            System.out.println("ParseException: " + e.getMessage());
        }
    }
}
