import java.util.Scanner;

public class _05 {
    public void findArrEle() throws Exp{
        Scanner sc = new Scanner(System.in);
        int [] arr = {23, 1, 3, 4, 12};
        int ind;
        System.out.println("Enter IndeX: ");
        ind = sc.nextInt();
        int i=0;
        while(i<=5){
        try{
        System.out.println(arr[ind]);
        }
        catch(Exception e){
            i++;
            System.out.println(e);
        }

        }
        if(i>=5){
            throw new Exp();
        }
    }
}
