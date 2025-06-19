import java.util.InputMismatchException;
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int[] marks = new int[5];
        int totalMarks = 0, avg, temp;
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks out of 100");
        try{
        for (int i = 0; i < 5; i++) {
            System.out.printf("Subject %d: ", i + 1);
            temp = sc.nextInt();
            if (temp > 100 || temp < 0) {
                check = true;
                System.out.println("Invalid entry of marks");
                break;
            } else {
                marks[i] = temp;
            }
            totalMarks += marks[i];
        }
    }catch(InputMismatchException e){System.out.println("Invalid input");};
        if (!check) {
            avg = totalMarks / 5;
            System.out.printf("Total marks out of 500: %d\n", totalMarks);
            System.out.printf("Total percentage: %d\n ", avg);
            System.out.println("--Student Grade--");
            if (avg >= 80) {
                System.out.println("Honours");
            } else if (avg >= 60 && avg <= 79) {
                System.out.println("First Division");
            } else if (avg >= 50 && avg <= 59) {
                System.out.println("Second Divison");
            } else if (avg >= 40 && avg <= 49) {
                System.out.println("Third Divison");
            } else {
                System.out.println("Failed");
            }
        
        }
        else{
            System.out.println("Re run the program");
        }
    }
}
