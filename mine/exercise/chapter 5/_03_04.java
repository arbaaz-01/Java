import java.util.Scanner;
public class _03_04 {

    static int factorial(int num){
        
        if(num<0){
            return -1;
        }
        else if(num ==0){
            return 1;
        }
        else{
            return num * factorial(num-1);
        }

    }
    static int fact(int num){
        int fact = 1;
        if(num<0){
            System.out.print("Invalid input");
            return -1;
        }
        else{
            for(int i=1; i<=num; i++){
                fact = fact * i;
            }
            return fact;
        }
    }
    static int fact_while(int num){
        int fact = 1;
        if(num>0){
        while(num>0){
            fact = fact * num;
            num--;
        }
        return fact;
    }
    else{
        // System.out.println("Negative number factorial is not possible");
        return -1;
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter number: ");
        // int num = sc.nextInt();
        // for(int i = 1; i <= 10; i ++){
            // System.out.printf("%d x %d = %d\n", num , i , num * i);
        // }

        // int num1 = 10;
        // int count = 10;
        // while(count != 0){
        //     count -=1;
        // }
        
        // for(int i = 10; i > 0; i--){
             // System.out.printf("%d x %d = %d\n", num1, i, num1 * i);
        // }


        // System.out.println(factorial(5));

        // System.out.println(fact(5));

        System.out.println(fact_while(-9));
    }
}
