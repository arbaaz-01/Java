class MyClass implements Int{

    @Override
    public int sum(int a, int b){
        return a+b;
    }

    @Override
    public void greet(){
        System.out.println("Hello there!");
    }
    
    public void meth(){
        System.out.println("Good Morning!");
        
    }
}

public class Main{
 
    public static void main(String[] args){

        Int in = new MyClass();
        System.out.println(in.sum(1,5));
        in.greet();

        in.meth();
    }
    
}