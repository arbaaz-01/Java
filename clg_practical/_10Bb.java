import java.util.Scanner;
public class _10Bb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, std;
        int rollno, percent;
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Student Class: ");
        std = sc.nextLine();
        System.out.print("Enter Student Roll No: ");
        rollno = sc.nextInt();
        System.out.print("Enter Student Percent: ");
        percent = sc.nextInt();
        System.out.println();
        System.out.println("--Student Details---");
        System.out.printf("Name: %s\nClass: %s\nRollno: %d \nPercent: %d", name, std, rollno, percent);
        sc.close();

    }   
}
