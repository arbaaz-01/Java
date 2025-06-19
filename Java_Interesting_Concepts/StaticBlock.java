// public class StaticBlock {
    


//     static class StaticNested{
//         // fields

//         void method(){
//             System.out.println("From Static block");
//         }
//         return 0;

//     }
    
// }

/*
 * From java version>=7 Main mehtod is required to in order to run the class.
 * Before java 7 static was able to run without requiring main method.
 * 
 */

 class StaticBlock{

    // static int Status = getStatus();

    // static int getStatus(){
    //     System.out.println("Static block");
    //     System.exit(0);
    //     return 0;
    // }

    static{
        System.out.println("Static Block");
        System.exit(0);
    }

    public static void main(String[] args) {
        
    }
}