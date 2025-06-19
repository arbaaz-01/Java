class A{

    A(){
        System.out.println("Object Created");
    }
    void method(){
        System.out.println("Method called");
    }
}

public class AnonymousObject {
    
    public static void main(String[] args) {
         /* 
         * This is allowed but since we do not have reference 
         * we cannot reuse it
         */
        new A();  // anonymous object
        new A().method();   

        A a = new A();  // reference object
        a.method();
    }
}
