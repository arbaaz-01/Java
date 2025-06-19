@FunctionalInterface
interface DemoAno {
    void meth1(String name);

    // void meth2();
}

// class AnonyDemo implements DemoAno {
//     public void display() {
//         System.out.println("Hello");
//     }

//     @Override
//     public void meth1() {
//         System.out.println("Meth_1...");
//     }

//     @Override
//     public void meth2() {
//         System.out.println("Meth_2...");
//     }
// }

public class Lambda_01 {
    public static void main(String[] args) {
        // AnonyDemo obj = new AnonyDemo();
        // obj.meth1();

        // DemoAno obj2 = new AnonyDemo();  // Dynamic method dispatch
        // obj2.meth1();
        // obj2.meth2();
        // obj2.display(); 


        //Anonymous Class

        // DemoAno obj = new DemoAno() {
        //     @Override
        //     public void meth1(){
        //         System.out.println("Meth_1...");
        //     }
        //     @Override
        //     public void meth2(){
        //         System.out.println("Meth_2...");
        //     }
        // };

        // obj.meth1();
        // obj.meth2();

        DemoAno obj = (name)->{
            System.out.println("I am meth 1.. " +name);
        };

        obj.meth1("arbaaz");  
    }
}
