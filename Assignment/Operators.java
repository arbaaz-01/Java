import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 2;
        // System.out.println("--Arithmetic Operators--");
        // System.out.println("a + b = " + (a+b));
        // System.out.println("a - b = " + (a-b));
        // System.out.println("a * b = " + (a*b));
        // System.out.println("a / b = " + (a/b));
        // System.out.println("a % b = "+ (a%b));

        // System.out.println("\n--Relational Operators--");
        // System.out.println("a > b: " + (a>b));
        // System.out.println("a < b: " + (a<b));
        // System.out.println("a == b: " + (a==b));
        // System.out.println("a >= b: " + (a>=b));
        // System.out.println("a <= b: " + (a<=b));

        // System.out.println("\n--Logical Operators--");
        // Boolean x = true, y = false;
        // System.out.println("AND: " + (x && y));
        // System.out.println("OR:  " + (x || y));
        // System.out.println("NOT: " + (!x));
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        if(z%2==0){
            System.out.printf("%d is a even number ", z);
        }
        else{
            System.out.println("Odd num");
        }
       
    }
}
