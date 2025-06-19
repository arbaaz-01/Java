class Base1{
    int x;

    Base1(){
        System.out.println("I am a Constructor");
    }
    Base1(int a){
        System.out.println("Overloaded Constructor of base class with value of a: "+a);
    }

}

class Derived extends Base1{
    int y;

    public Derived() {
        // super(0);
        System.out.println("Derived class constructor");
    }
    // 
    public Derived(int a, int b){
        super(a);
        System.out.println("Overloaded Constructor of derived class with value of b " + b);
    }
}

class ChildOfDerived extends Derived{
    int z;
    ChildOfDerived(){
        System.out.println("Child class constructor");
    }
    ChildOfDerived(int a, int b, int c){
        super(a, b);
        System.out.println("Overloaded Constructor of Child class with value of c: "+c);
    }
}



public class _Const_Inheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();

        // Derived d = new Derived(2, 3);

        // ChildOfDerived e = new ChildOfDerived();

        ChildOfDerived e = new ChildOfDerived(12, 34, 90);
    }
}
