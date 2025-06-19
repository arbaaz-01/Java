class CO{

    int a;
    String b;
    boolean c;

    public CO(){
        System.out.println("Constructor without any params");
    }

    protected CO(int a, String b){
        this.a=a;
        this.b=b;
    }

    public CO(int a, String b, boolean c){
        this(a,b);
        this.c=c;
    }

    protected void meth(){
        System.out.println("Hello");
    }
}

class C extends CO{

   @Override
   public void meth(){
    System.out.println("Overriden meth");
   }
}


public class ConstructorOverloading {
    public static void main(String[] args) {
        CO c = new CO(1, "a");
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        c.meth();
    }
}
