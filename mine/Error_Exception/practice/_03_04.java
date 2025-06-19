import java.util.Scanner;
class Exp extends Exception{
    @Override
    public String toString(){
        return "Max retrieves reached";
    }
    public String getMessage(){
        return "i.e 5";
    }
}
public class _03_04 {
    public static void main(String[] args) {
        int [] arr = {23, 1, 3, 4, 12};
        Scanner sc = new Scanner(System.in);
        // try{
        //     for(int i=0; i<100; i++){
        //         System.out.println("Enter Index: ");
        //         int ind = sc.nextInt();
        //         System.out.println(arr[ind]);
        //     }
        // }
        // catch(IndexOutOfBoundsException e){
        //     System.out.println("Error");
        // }

        boolean flag = true;
        int i = 0;
        while(flag && i<5){
            try{
                System.out.println("Enter  value of Index: ");
                int ind = sc.nextInt();
                System.out.println(arr[ind]);
                break;
            }
            catch(Exception e){
                i++;
                System.out.println("Invalid Index");
            }
        }
        if(i>=5){
            // System.out.println("Error");
            try{
            throw new Exp();
            }
            catch(Exp e){
                System.out.println(e);
            }
        }

    }
}
