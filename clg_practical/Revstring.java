import java.util.*;

public class Revstring {
    public static void main(String[] args) {
        String s, t = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some text: ");
        s = sc.nextLine();
        int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            t = t + s.charAt(i);
        }
        System.out.println("Reverse String: " + t);

    }
}
