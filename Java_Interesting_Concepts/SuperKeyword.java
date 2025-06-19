class KK{
    String name = "Parent";
    int age;

    public KK(){
        System.out.println("Parent constructor");
    }

    public KK(int age){
        this.age=age;
        System.out.println("Parent parameter constructor");
    }

    public void kmethod(){
        System.out.println("Parent method!");
    }

    public void kmethod(String s, int a){
        System.out.println(s);
        System.out.println(a);
    }

    public int kmethod(int a, String s){
        System.out.println(a);
        System.out.println(s);
        return 0;
    }




}

class MM extends KK{

    public MM(){
        super();
    }

    public MM(int age){
        super(age);
        super.kmethod();
        System.out.println(super.name);
    }

    public void method(){
        super.kmethod();
        System.out.println(super.name);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        // MM m = new MM(12);


        KK k = new KK();

        k.kmethod("Arbaz", 1);
        k.kmethod(1, "Arbaz");

        
        
        
    }
}
