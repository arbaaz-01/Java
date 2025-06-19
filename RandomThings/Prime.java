import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {

        boolean prime;
        for (int i = 2; i <= 100; i++) {
            prime = true;
            for (int j = 2; j <= i/2; j++) {
                if ((i % j) == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }

        }
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int num = sc.nextInt();
    //     if(num>=1){
    //     boolean p = true;;
    //     for(int i=2; i<num; i++){
    //         if(num%i==0){
    //             p = false;
    //             break;
    //         }

    //     }
    //     if(p && (num !=1)){
    //         System.out.println("Yes it is prime number");
    //     }
    //     else{
    //         System.out.println("No its not a prime number");
    //     }
    // }   
    // else{
    //     System.out.println("Enter positive Integers Only!!");
    // }

    //     sc.close();
    }

    
}
