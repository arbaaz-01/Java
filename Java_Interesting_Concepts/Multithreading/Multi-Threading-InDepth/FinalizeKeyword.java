public class FinalizeKeyword {
    public static void main(String[] args) {
        
        for(int i=0; i<100000; i++){
            MyClass my = new MyClass();
        }
    }
}

class MyClass{

    @Override
    public void finalize() throws Throwable{
        System.out.println("Object is being Garbage Collected");
    }


}
