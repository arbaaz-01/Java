public class Main extends Abs {
    Main(){
        super();
        System.out.println("Main Const");
    }

    Main(String n, int age){
        super(n, age);
        System.out.println("Main parameterized Const");
    }

    @Override
    public void greetHuman(String n){
        System.out.println("Hello "+ n);
    }

    @Override
    public int sum(int a, int b){
        return a+b;
    }

    @Override
    public String random(){
        return "JAVA";
    }

    public void meth(){
        System.out.println("Specific to Main");
    }

    public static void main(String[] args) {
        
        // Main m = new Main("John", 22);
        Abs m = new Main("John", 22);
        System.out.println(m.getName());
        System.out.println(m.getAge());

        m.greetHuman("John");
        System.out.println(m.sum(1, 2));
        System.out.println(m.random());


    }
}
