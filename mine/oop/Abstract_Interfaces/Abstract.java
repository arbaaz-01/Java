abstract class Parent{
    public Parent(){
        System.out.println("Constructor of Base class");
    }
    public void sayHello(){
        System.out.println("hello");
    }

    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }

}
abstract class child2 extends Parent{

}

public class Abstract {
    public static void main(String[] args) {
        // Parent p = new Parent();
        Child C = new Child();

    }
}
