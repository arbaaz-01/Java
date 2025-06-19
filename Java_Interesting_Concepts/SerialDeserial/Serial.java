import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {
        
        Student st = new Student("Arbaz", "arbaz@gmail.com",22, "Mumbai");

        try{
            FileOutputStream fos = new FileOutputStream("ob.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(st);

            fos.close();
            oos.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }    
}
