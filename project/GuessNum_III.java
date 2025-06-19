import java.util.Random;
import java.util.Scanner;

class Game{
    Scanner sc = new Scanner(System.in);
    Random rand = new  Random();
    int num;
    int usrGuess;
    int noOfGuess=0;
    Game(){
        num = rand.nextInt(101);
    }
    void takeUserInput(){
        System.out.println("Guess a number between 0-100");
        usrGuess = sc.nextInt();
    }
    boolean isCorrectNum(){
        noOfGuess++;
        if(usrGuess == num){
            System.out.printf("Right Guess number was %d You Guessed in %d attempts", num, noOfGuess);
            return true;
        }
        else{

            if(num>usrGuess){
                System.out.println("Guess number is small");
            }
            else if(num < usrGuess){
                System.out.println("Guess number is big");
            }
            else{
                System.out.println("Invalid entry");
            }
            return false;            
        }
    }
}
public class GuessNum_III {
    public static void main(String[] args) {
    
        Game g = new Game();
        g.takeUserInput();
        g.isCorrectNum();
        boolean a = false;
        while(!a){
            g.takeUserInput();
            a = g.isCorrectNum();
        }
       
    }
}
