class A{
    // Final method
    public final void meth1(){
        System.out.println("Final method");
    }
}
class B extends A{
    // public void meth1(){
    //     System.out.println("Overrinding meth1");
    // }
}

// Final class
final class C{
    public void meth(){
        System.out.println("fuinal class");
    }
}

// class D extends C{

// }

public class Final {
    public static void main(String[] args) {
        final int A = 100;   //Final Variable
        System.out.println(A);
        // int A = 19;   --> throw an error
        B b = new B();
        b.meth1(); 
    }
}
