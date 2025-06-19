import java.util.Scanner;
class Rectangle{
    Scanner sc = new Scanner(System.in);
    float length;
    float breadth;

    public void getInput(){
        System.out.print("Enter Lenght: ");
        length = sc.nextFloat();
        System.out.print("Enter Breadth: ");
        breadth = sc.nextFloat();
    }
    public float area(){
        return length * breadth;
    }
    public float perimeter(){
        return 2 * (length + breadth);
    }
}

public class _04 {
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle();
        // r1.length = 5;
        // r1.breadth = 3;
        r1.getInput();
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
    
}
