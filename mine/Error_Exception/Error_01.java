import java.util.Scanner;
public class Error_01 {
    public static void main(String[] args) {
        // int a = 90  --> Syntax Error semicolon missing
        // b = 10   --> b isn't declared Syntax error is also called compile time error
      
        // Logical Error for printing prime numbers
        // System.out.println(2);
        for(int i=1; i<5; i++){
            // System.out.println(2*i+1);
        }

        // Runtime error
        Scanner sc = new Scanner(System.in);
        // try {
            
        //     int a = sc.nextInt();
        // } catch (Exception e) {
        //     System.out.println("Invalid entry");
        // }

        // int b = sc.nextInt();
        // System.out.println("Integer part of 1000 divided by b is "+1000/b);


        int x = 100;
        int y = sc.nextInt();
        
        try{
            int z = x/y;
        }
        catch(Exception e){
            System.out.println("Division failed. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}
