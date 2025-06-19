import java.util.Scanner;
import java.io.*;

public class PasswordHideConsole {
    
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email: ");
        String email = sc.nextLine();

        System.out.println("Enter passwrod: ");

        Console con = System.console();
        String password = con.readLine();

        if(email.equals("arbaaz@ali.com") && password.equals("123")){
            System.out.println("\nLogin Successfull!\n");
        }
        else{
            System.out.println("\nIvalid username or password\n");
        }

    }
}
