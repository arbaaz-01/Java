import java.util.Scanner;

public class _13_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        switch(age){ 
            case 0:
                System.out.println("U r just born");
                break;
            case 7:
                System.out.println("Still growing!");
                    break;
            case 12:
                System.out.println("In puberty");
                break;
            case 18:
                System.out.println("Adult");
                break;
            default:
                System.out.println("Enjoy Life");
        }

        String var = "a";
        switch(var){
            case "c" -> System.out.println("case 1");
            case "b" -> System.out.println("case 2");
            case "d" -> System.out.println("case 3");
            case "a" -> System.out.println("case 4");
            case "z" -> System.out.println("case 5");
            case "x" -> System.out.println("case 6");
            default  -> System.out.println("default");
        }
        sc.close();
    }
}
