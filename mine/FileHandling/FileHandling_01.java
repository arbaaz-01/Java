import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling_01 {
    public static void main(String[] args) {

        // Code to create a new file
        File myFile = new File("myFirstJavaFile.txt");

        try{
        myFile.createNewFile();
        }
        catch(IOException e){
        System.out.println("Unable to create this file");
        e.printStackTrace();
        }

        // Code to write to a file

        // try {FileWriter fileW = new FileWriter("myFirstJavaFile.txt");

        // fileW.write("I am in love with Java...\nYeah it's working");
        // fileW.close();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // Reading a file

        // try {
        //     Scanner sc = new Scanner(myFile);
        //     while (sc.hasNextLine()) {
        //         String line = sc.nextLine();
        //         System.out.println(line);
        //     }
        //     sc.close();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }


        // Deleting a file
        
        // if(myFile.delete()){
        //     System.out.println("I have deleted: "+myFile.getName());
        // }
        // else{
        //     System.out.println("Some problem occurred while deleting the file");
        // }

    }
}
