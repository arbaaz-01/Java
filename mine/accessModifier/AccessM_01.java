package accessMod;
class C1{
    public int b = 45;
    protected int c = 50;
    int a = 32;   //Default 
    private int d = 100;

    public void meth(){
        System.out.printf("a: %d b: %d c: %c d: %d \n", a,b,c,d);
    }
    protected void meth1(){
        System.out.println("Protected method");
    }

    void meth2(){
        System.out.println("Default Method");
        meth3();
    }
    private void meth3(){
        System.out.println("Private method");
    }
}

public class AccessM_01 {
    public int aa = 90;
    protected int bb = 100;
    int cc = 13;
    private int dd = 34; 
    public void helloP(){
        System.out.println("Hello Public...");
    }
    protected void helloPro(){
        System.out.println("Hello Protected...");
    }
     void helloDefault(){
        System.out.println("Hello Default...");
    }
    private void helloPrivate(){
        System.out.println("Hello Private...");
    }
    public static void main(String[] args) {
        C1 c = new C1();
        c.meth();
        c.b= 200;
        c.c = 120;
        c.a =300;
        // c.d = 1000;
        // c.meth();

        c.meth1();
        c.meth2();
        // c.meth3();

    }
}
