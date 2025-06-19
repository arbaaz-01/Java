import java.util.Scanner;
public class _8_Strings {
    public static void main(String[] args) {
            String a = "shaikh arbaaz";
            // Strings are immutable i.e. they cannot be changed
            // String b = new String("Shaikh arbaaz");
            System.out.print("The name is: ");
            System.out.println(a);


            int x = 5;
            float y = 5.3244f;
            System.out.printf("The value of x is %d ", x);
            System.out.printf("The value of y is %f ", y);
            System.out.println();
            System.out.format("The value of y is %f ", y);
            System.out.println();

            Scanner sc = new Scanner(System.in);
            // String str = sc.next();
            String str = sc.nextLine();
            System.out.println(str);
    }
}
