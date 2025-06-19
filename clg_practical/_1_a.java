import java.util.Scanner;

public class _1_a {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle");
        float lenght = sc.nextFloat();
        System.out.println("Enter Breadth of Rectangle");
        float breadth = sc.nextFloat();
        float area = lenght * breadth;
        System.out.println("Area of Rectangle: " + area + " sq unit");

        sc.close();
    }    
}
