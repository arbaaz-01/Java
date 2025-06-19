import java.util.Scanner;

public class SpecificExp_02 {

    public static void main(String[] args) {
        
        int [] marks = new int[3];
        marks[0] = 9;
        marks[1] = 19;
        marks[2] = 49;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number u want to divide the value with: ");
        int num = sc.nextInt();
        try{
            System.out.printf("The value at inde %d is %d\n", ind, marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind]/num);
        }catch(ArithmeticException e){
            System.out.println("---Arithmetic Exception---");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException b){
            System.out.println("---IndexOutOfBound---");
            System.out.println(b);
        }
        catch(Exception c){
            System.out.println("Some other exception occurred");
            System.out.println(c);
        }
    }    
}
