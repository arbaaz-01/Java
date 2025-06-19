import java.util.Scanner;
public class fibonacci {

    public static void main(String[] args) {
        int a = 0, b = 1, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int n  = sc.nextInt();
        System.out.print(a+" "+b);
        
        for(int i=0; i<n-2; i++){
            
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
        

    }
    
}
