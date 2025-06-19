class A{
    int a=100;

    void meth(){
        System.out.println("Hello!");
    }
}

class B extends A{
    int a=501;

    @Override
    void meth(){
        System.out.println("World!");
    }
}


public class VariableHiding{
    public static void main(String[] args) {
        
        B b = new B();
        // System.out.println(b.a);

        A obj = new B();
        // System.out.println(obj.a);

        obj.meth();

        
    }
}