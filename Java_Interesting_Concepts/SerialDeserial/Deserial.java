import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {
    public static void main(String[] args) {
        try{
            FileInputStream fos = new FileInputStream("ob.txt");

            ObjectInputStream ois = new ObjectInputStream(fos);
            
            Student st = (Student) ois.readObject();

            st.displayName();
            System.out.println(st.getName());
            System.out.println(st.getEmail());
            System.out.println(st.getAge());
            System.out.println(st.getAddress());
            fos.close();
            ois.close();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
