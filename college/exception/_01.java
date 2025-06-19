import java.util.InputMismatchException;
import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
        int a, b;
        // System.out.println(a/b);
        Scanner sc = new Scanner(System.in);
        try{
            // a = sc.nextInt();
            // b = sc.nextInt();
            // System.out.println(a/b);

            int divideByZero = 5/0;
        }
        catch(Exception e){
            // System.out.println(e.toString());
            // System.out.println("ArithmeticException=> "+e.getMessage());
            System.out.println(e);
        }
        // catch(InputMismatchException e){
        //     System.out.println(e.getMessage());
        // }
    
        finally{
            System.out.println("I run despite try block throws error or not");
        }
    }
}
