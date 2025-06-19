import java.util.Scanner;

public class Fibonacci {
    public static void fibonacciIter(int n){
        int first = 0, second = 1;
        int counter=0;
        while(counter < n){
        // while(n>0){
            System.out.println(first);
            int temp = first + second;
            first = second;
            second = temp;
            counter++;
            // n--;
        // }
        }
    }

    public static int fiboRecur(int n){
        if(n == 1 || n == 0){
            return n;
        }
        return fiboRecur(n-1) + fiboRecur(n-2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 0  1  1  2 3  5  8  13  21  34  55 89

        fibonacciIter(10);

        // System.out.println(fiboRecur(7));

        // System.out.print("Enter value of N: ");
        // int n = sc.nextInt();

        // for(int i=0; i<n; i++){
        //     System.out.print(fiboRecur(i) + " ");
        // }

    }
}
