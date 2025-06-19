import java.util.Scanner;
import java.util.Arrays;

public class _9AA {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        str = sc.nextLine();
        char [] charArr = str.toCharArray();
        Arrays.sort(charArr);
        System.out.println(charArr);
        sc.close();
    }
}
