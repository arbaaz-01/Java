import java.util.ArrayList;
import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> stud = new ArrayList<>(10);
        for(int i=0; i<10; i++){
            String name;
            System.out.println("Enter Student "+i+" name");
            name = sc.nextLine();
            stud.add(name);
        }

        for(String s:stud){
            System.out.print(s+" ");
        }

        ArrayList ar = new ArrayList();
        ar.add(10);
        System.out.println(ar);


    }
}
