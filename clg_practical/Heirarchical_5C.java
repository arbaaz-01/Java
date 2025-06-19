import java.util.Scanner;
class HierarchicalA{
    void display(){
        System.out.println("Hierarchical Inheritance");
    }
}
class HierarchicalB extends HierarchicalA{
    void sqrt(int num){
        System.out.println(num * num);
    }
}
class HierarchicalC extends HierarchicalA{
    void cube(int num){
        System.out.println(num * num * num);
    }
}
public class Heirarchical_5C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        HierarchicalB obj = new HierarchicalB();
        HierarchicalC obj2 = new HierarchicalC();
        obj2.display();
        obj.sqrt(num);
        obj2.cube(num);
    }
}
