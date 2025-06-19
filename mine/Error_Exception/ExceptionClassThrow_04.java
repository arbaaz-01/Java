import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I am toString()";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
} 
class MaxAgeException extends Exception{
    public String toString(){
        return "Age cannot be greater than 150";
    }
    public String getMessage(){
        return "Enter correct age";
    }
}
public class ExceptionClassThrow_04 {
    public static void main(String[] args) {
        int a ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        a = sc.nextInt();
        if(a<9){
            try{
            // throw new MyException();
                throw new ArithmeticException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                // System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        if(age > 150){
            try{
                throw new MaxAgeException();
            }
            catch(Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);
            }
        }
    }
}
