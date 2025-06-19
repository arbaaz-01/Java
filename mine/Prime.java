import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
    //     boolean check = true;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int num = sc.nextInt();
    //     if (num == 0 || num == 1) {
    //         System.out.println("Not prime");
    //     } else {
    //         for (int i = 2; i < num; i++) {
    //             if (num % i == 0) {
    //                 check = false;
    //                 break;
    //             }
    //         }
    //     }
    //     if (check) {
    //         System.out.println(num + " is a prime number");
    //     } else {
    //         System.out.println("Not a prime number");
    //     }

        // Printing prime numbers in a given range
        boolean prime = true;
        int rangeStart = 1;
        int rangeEnd = 10;
        // if(rangeStart == 1){
        //     rangeStart += 1;
        // }
        for (int i = rangeStart; i <= rangeEnd; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;

                }
            }
            if (prime && i!=1){
                System.out.print(i +" ");
            }
            else{
                prime = true;
            }

        }

    }
}

