import java.util.Random;
import java.util.Scanner;

public class Game_II {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("0 for Rock\n1 for Paper\n2 for Scissors");
        int usrInput = sc.nextInt();

        int compInput = rd.nextInt(3);
        
        if(usrInput == compInput){
            System.out.println("Draw");
        }
        // All possibilities for user to win
        else if(usrInput == 0 && compInput == 2 || usrInput == 1 && compInput == 0 || usrInput == 2 && compInput == 1){
            System.out.println("You Win!!");
        }
        else{
            System.out.println("Computer Win");
        }
        System.out.println("Computer Choice: "+compInput);
        
    }
}
