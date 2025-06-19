class Base{
    int x;
    Base(){
        System.out.println("Base class constructor");
    }
    Base(int x){
        System.out.println("Base class OverLconstructor: "+ x);
    }
    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }    

    public void greet(){
        System.out.println("Hello");
    }
}

class Derived extends Base{
    int y;
    Derived(){
        super(34);
        System.out.println("Constructor");
        greet();
    }
}

public class _This_Super {
    public static void main(String[] args) {
        
        // Base b = new Base();
        // b.setX(23);
        // System.out.println(b.getX());

        Derived d = new Derived();

    }    
}
