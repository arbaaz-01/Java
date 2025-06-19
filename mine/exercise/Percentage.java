// package exercise;
import java.util.Scanner;

public class Percentage {
    public static void main(String[] args){
        System.out.println("Percentage Calculator");
        System.out.println("Enter Marks of Each Subject");
        
        Scanner P = new Scanner(System.in);
        System.out.print("Enter Marks of Subject 1: ");
        float sub1_marks = P.nextFloat();
        System.out.print("Enter Marks of Subject 2: ");
        float sub2_marks = P.nextFloat();
        System.out.print("Enter Marks of Subject 3: ");
        float sub3_marks = P.nextFloat();
        System.out.print("Enter Marks of Subject 4: ");
        float sub4_marks = P.nextFloat();
        System.out.print("Enter Marks of Subject 5: ");
        float sub5_marks = P.nextFloat();

        float total_marks = sub1_marks + sub2_marks + sub3_marks + sub4_marks + sub5_marks;

        float percentage = (total_marks/500) * 100;

        System.out.println("Percentage: " + percentage + "%");
    }
}
