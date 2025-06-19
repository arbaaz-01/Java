import java.util.Scanner;
public class switch_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int usr = sc.nextInt();
        String day = "";

        switch(usr){
            case 1:
                day = "Monday";
                break;  
            case 2:
                day = "Tuesday";
                break;  
            case 3:
                day = "Wednesday";
                break;  
            case 4:
                day = "Thursday";
                break;  
            case 5:
                day = "Friday";
                break;  
            case 6:
                day = "Saturday";
                break;  
            case 7:
                day = "Sunday";
                break;
            default:
                System.out.println("Userinput must be from 1 to 7");  
        }

        System.out.println("Day: "+ day);
    }
}
