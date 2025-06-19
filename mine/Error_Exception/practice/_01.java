import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
        // Syntax error
        // String a = hello;

        // Logical Error
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // if((year%4==0) && (year%100!=0) || (year%400==0)){  --> Correct Logic
            if(year % 4==0){   // --> Wrong Logic
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }

        // Runtime error
        int a = sc.nextInt();
        System.out.println(a);   // If user enters string character
    }
}
