import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, remainder, reverse=0; 
        num = 12345;
        while(num != 0){
            remainder = num%10;
            reverse = (reverse * 10) + remainder;
            num /=10;
        }
        System.out.println("Reversed: " + reverse);
    }
}
