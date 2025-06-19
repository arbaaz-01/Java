import java.util.Scanner;
import java.util.Random;

public class game_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int round = 1;
        int usrPoints = 0, comPoints = 0;
        char sel;
        System.out.println("Total 5 rounds to be played");
        while (round != 6) {
            System.out.println("ROUND: "+round);
            int comp = rand.nextInt(1, 4);

            if (comp == 1) {
                sel = 'R';
            } else if (comp == 2) {
                sel = 'P';
            } else {
                sel = 'S';
            }
            System.out.print("Enter you Choice ");
            System.out.println("R: Rock, P: Paper, S: Scissors");
            char usr = sc.next().charAt(0);
            if (sel == usr) {
                System.out.println("You Select "+usr+" Comp Select "+sel);
                System.out.println("TIEE");
                usrPoints += 0;
                comPoints += 0;
            } else if (sel == 'R') {
                if (usr == 'P') {
                    System.out.println("You Select "+usr+" Comp Select "+sel);
                    System.out.println("YOU WIN!");
                    usrPoints += 1;
                } else if (usr == 'S') {
                    System.out.println("You Select "+usr+" Comp Select "+sel);
                    System.out.println("COMP WINS!!");
                    comPoints += 1;
                }
            } else if (sel == 'P') {
                if (usr == 'R') {
                    System.out.println("You Select "+usr+" Comp Select "+sel);
                    System.out.println("COMP WINS!");
                    comPoints += 1;
                } else if (usr == 'S') {
                    System.out.println("You Select "+usr+" Comp Select "+sel);
                    System.out.println("YOU WIN!!");
                    usrPoints += 1;
                }
            } else if (sel == 'S') {
                if (usr == 'R') {
                    System.out.println("You Select "+usr+" Comp Select "+sel);
                    System.out.println("YOU WIN!");
                    usrPoints += 1;
                } else if (usr == 'P') {
                    System.out.println("You Select "+usr+" Comp Select "+sel);
                    System.out.println("COMP WINS!!");
                    comPoints += 1;
                }
            }
            round = round + 1;
        }
        System.out.println("Final Result");
        if (usrPoints > comPoints) {
            System.out.println("YOU WON THE GAME YOUR SCORE: " + usrPoints + " COMP SCORE: " + comPoints);
        } else if (comPoints > usrPoints) {
            System.out.println("YOU LOOSE TO COMP YOUR SCORE: " + usrPoints + " COMP SCORE: " + comPoints);
        } else {
            System.out.println("IT'S A TIE YOUR SCORE: " + usrPoints + " COMP SCORE: " + comPoints);
        }

    }
}
