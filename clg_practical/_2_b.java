import java.util.Scanner;

public class _2_b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, r1=0, r2=0, div;
        System.out.print("Enter value of a: ");
        a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        c = sc.nextDouble();
        
        d = b*b - 4*a*c;
        div = 2 * a;
        // System.out.println(d);
        if(d>0){
            System.out.println("Roots are real and unequal");
            r1 = (-b + Math.sqrt(d))/div;
            r2 = (-b - Math.sqrt(d))/div;   
            System.out.println(r1);
            System.out.println(r2);
        }
        else if(d==0){
            double x = -b/div;
            System.out.println("Roots are real and equal");
            System.out.println("x: "+ x);
         }
        else{
            System.out.println("Roots are complex");
        }
        sc.close();
    }    
}
