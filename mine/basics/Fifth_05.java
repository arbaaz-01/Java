// Operators
import java.util.Scanner;
public class Fifth_05 {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int a = 4;
    int b = 4 * a;
    int c = 2;
    c *= b;

    
    // System.out.println(b);
    // System.out.println(c);

    // System.out.println("Enter a number: ");
    // int num = sc.nextInt();
    // if((num % 2) == 0){
    //     num++;
    //     System.out.println("Num is even");
    // }
    // else{
    //     System.out.println("Num is odd");
    //     num--;
    // }

    // System.out.println("After Increment/Decrement: " + num);
    // System.out.println("When odd: " + num);



    // Logical Operators
    System.out.println(45>44 && 774>90);
    System.out.println(45>44 || 44>90);
    
    // Bitwise Operator
    System.out.println("Bitwise");
    System.out.println(5 & 10);
    System.out.println(3 & 4);
    System.out.println(5 & 7);
    
    System.out.println(5 | 7);
    System.out.println(5 | 10);

    System.out.println(4.8 % 1.1);
}
}
