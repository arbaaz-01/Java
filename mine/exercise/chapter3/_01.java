import java.util.Scanner;
public class _01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1

        // String n;
        // n = new String("Arbaaz");
        // System.out.println("Enter text in Caps: ");
        // String n1 = sc.nextLine();

        // String n1Caps = n1.toLowerCase();
        // System.out.println(n1Caps);


        // Q2

        // String str = " cn dbms  had  ";
        // System.out.println(str.replace( ' ', '_'));
        // System.out.println(str.replace( " ", "_"));


        // Q3
        // String s = "Dear <|name|>, Thanks a lot";
        // String rep_s = s.replace("<|name|>", "Harris Bro");
        // System.out.println(rep_s);

        // Q4
        String ss = "lore ipsum  dolor sit  amet";
        // System.out.println(ss[1]);
        char [] ch = ss.toCharArray();
        System.out.println(ch[2]);
        int single_s = 0;
        int double_s = 0;
        for(int i=0; i<ss.length(); i++){
            if(ch[i] ==  ' '){
                single_s++;
            }
        }
        System.out.println(single_s);
        System.out.println(ss.indexOf(" "));
        System.out.println(ss.indexOf("  "));


        // Q5
        // String letter = "Dear Harris\n\tThis Java Course is nice. \nThanks";
        // System.out.println(letter);
    }
}
