// package exercise;
import java.util.Scanner;
public class sum_02 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //  int num1 = sc.nextInt();
        //  int num2 = sc.nextInt();
        //  int num3 = sc.nextInt();

        // System.out.println(num1 + num2 + num3);

        // Question 2

        float sub_1 = 53;
        float sub_2 = 93;
        float sub_3 = 35;
        float avg = (sub_1 + sub_2 + sub_3)/3;
        float cgpa = avg/10;

        // System.out.println(cgpa);


        // Question 3

        // System.out.print("Enter your Name: ");
        // String a = sc.next();
        // System.out.println("Hello " + a + " have a good day");

        // Question 4 
        // System.out.print("Enter value in kilometers: ");
        // double km = sc.nextFloat();        
        // double miles = km / 1.609;

        // System.out.println(miles + "Miles");

        System.out.println("Enter Number");
        System.out.println(sc.hasNextInt());

    }
    
}
