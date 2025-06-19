public class Characters_3b {
    public static void main(String[] args) {
        String s = " hey 12 % 4 @ ";
        char[] ch = s.toCharArray();
        int letters=0, spaces=0, numbers=0, others=0;
        for(int i=0; i<s.length(); i++){
            if(Character.isLetter(ch[i])){
                letters++;
            }
            else if(Character.isDigit(ch[i])){
                numbers++;
            }
            else if(Character.isSpaceChar(ch[i])){
                spaces++;
            }
            else{
                others++;
            }
        }
        System.out.println("Letters: "+letters);
        System.out.println("Numbers: "+numbers);
        System.out.println("Spaces: "+spaces);
        System.out.println("others: "+others);
    }
}

// import java.util.Scanner;
// public class Characters_3b{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a String: ");
//         String str = sc.nextLine();
//         int letters=0, numbers=0, spaces=0, others=0;
//         for(int i=0; i<str.length(); i++){
//             if(str.charAt(i) == ' '){
//                 spaces++;
//             }
//             else if(Character.isAlphabetic(str.charAt(i))){
//                 letters++;
//             }
//             else if(Character.isDigit(str.charAt(i))){
//                 numbers++;
//             }
//             else{
//                 others++;
//             }
//         }
//         System.out.println("Letters: "+letters);
//         System.out.println("Numbers: "+numbers);
//         System.out.println("Spaces: "+spaces);
//         System.out.println("Others: "+others);
//     }
// }
