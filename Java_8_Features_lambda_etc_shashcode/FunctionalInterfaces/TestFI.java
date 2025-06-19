@FunctionalInterface

interface FI {
    
    void show();

    
    // void find();    // not allowed


    static void greet(String name){
        System.out.println("Good Day "+name);
    }

    default int cube(int n){
        return n*n*n;
    } 
}



public class TestFI implements FI{

    @Override
    public void show(){
        System.out.println("Show is on!");
    }
    public static void main(String[] args) {
        
        FI.greet("Arbaz");
        TestFI test = new TestFI();
        System.out.println(test.cube(2));
    }
}
