interface MyInterface{
    void meth1();
    void meth2();
}
interface ChildInter extends MyInterface{
    void meth3();
    void meth4();
}
class Myclass implements MyInterface{
    public void meth1(){
        System.out.println("Meth1");}
    public void meth2(){
        System.out.println("Meth2");}
    public void meth3(){
        System.out.println("Meth3");}
    public void meth4(){
        System.out.println("Meth4");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Myclass c = new Myclass();
        c.meth1();
        c.meth2();
        c.meth3();
        c.meth4();
    }
}
