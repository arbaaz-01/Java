public class NumberPalindrome {
    public static void main(String[] args) {
        int num = 4453544;
        int temp = num;
        int rev = 0, remainder;
        while(num != 0){
            remainder = num%10;
            rev = (rev*10) + remainder;
            num = num/10;
        }
        // System.out.println(rev);
        // System.out.println(num);
        if(rev == temp){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
}
