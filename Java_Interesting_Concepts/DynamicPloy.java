class A{
    int a=10;
    public void meth1(){
        System.out.println("Method of Class A");
    }

    public int meth2(){
        return 111;
    }
    
    public int meth2(int a, int b){
        return a+b;
    }
    public boolean meth2(long a){
        return true;
    }
}

class B extends A implements Int, Int2{
    int a=99;
    @Override
    public void meth1(){
        System.out.println("Overridden method from class B");
    }

    @Override
    public void intMeth(){
        System.out.println("Implemented interface method");
    }
    
    @Override
    public void int2Meht(){
        System.out.println("Implemented interface2 method");

    }

    @Override
    public int meth2(){ // we cannot reduce visibility from public
        return Integer.MIN_VALUE;
    }
}

interface  Int{

    double PI=3.142;

    void intMeth();

    public default void defMethod(){
        System.out.println("Interface default method");
    }

    static void staticMethod(){
        System.out.println("Interface static method");
    }



}

interface Int2{

    void int2Meht();


    private void IntPrivateMeth(){
        System.out.println("Interface private method");
    }

    private static void IntPrivateStaticMeth(){
        System.out.println("Interface private static method");
    }

    public default void int2DefMeth(){
        IntPrivateMeth();
        IntPrivateStaticMeth();
    }
}




public class DynamicPloy {
    public static void main(String[] args) {
        // A a = new B();
        // a.meth1();  // dynamic methood dispatch (Runtime polymorphism)
        // System.out.println(a.meth2());
        // System.out.println(a.a);   // variable hiding
        // System.out.println(a.meth2(12));

        // B b = new B();
        // b.intMeth();
        // b.meth1();
        // System.out.println(b.meth2());

        // Int.staticMethod();

        // b.defMethod();

        // b.int2Meht();

        // b.int2DefMeth();

         
        System.out.println(sum(1,2,34,24,1));
    }

    public static int sum(int a, int... arr){
        int s=0;
        for(int ele:arr) s+=ele;
        return s;
    }
}

