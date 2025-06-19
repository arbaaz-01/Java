import java.util.Scanner;
public class NestedTryCatch_03 {
    public static void main(String[] args) {
        int[] marks = {23, 34, 12, 11};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index: ");
        int ind = sc.nextInt();
        try{
            System.out.println("Welcome... ");
            try{
                System.out.println(marks[ind]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exists");
                System.out.println("Exception in level 2");
            }
        }catch(Exception e){
            System.out.println("Exception in level 1");
        }
    }    
}
