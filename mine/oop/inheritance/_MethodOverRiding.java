class Base{
    int x;
    Base(int x){
        this.x=x;
    } 
    public String greet(String name){
        return "Hello "+name+ " from Base class";
    }
    public void display(){
        System.out.println(x);
    }
    public void show(){
        System.out.println("x: "+x);
    }
}

class Derived extends Base{
    int y;
    Derived(int x, int y){
        super(x);
        this.y=y;
    }
    @Override
    public String greet(String name){
        return "Hello "+name+" from Derived class";
    }
    @Override
    public void show(){
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}

public class _MethodOverRiding {
    public static void main(String[] args) {

        Base b = new Base(4);
        System.out.println(b.greet("arbaaz"));
        b.show();

        System.out.println("***************");
        Derived d = new Derived(3, 4);
        System.out.println(d.greet("arbaaz"));
        d.show();
    }
}
