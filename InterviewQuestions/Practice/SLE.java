// package Practice;
import java.rmi.server.SocketSecurityException;
import java.util.Arrays;
public class SLE {
    
    public static void main(String[] args) {
        
        int[] arr = {300, 23, 90, 100, 300, 250, 250, 250, 300, 100, 300, 250};
        SLE s = new SLE();
        int res = s.sLE(arr);
        System.out.println("\nSecond Largest Element is: ");
        System.out.println(res);
    }
    public int sLE(int [] arr){
        Arrays.sort(arr);
        for(int ele:arr){
            System.out.print(ele + " ");
        }
        int len = arr.length;
        // return arr[len-2]; 

        // 23 90 100 100 250 300
        int s=0;
        // int third = 0;
        for(int i=len-1; i>=0; i--){
            if((arr[i] != arr[i-1])){
                // s = arr[i-1];
                s = i - 1;
                System.out.println("\nI: "+i);
                System.out.println(arr[s]);
                // break;
                for(int j=s; j>=0; j--){
                    if(arr[j] != arr[j-1]){
                        int third = arr[j-1];
                        System.out.println("Third largest: "+third);
                        break;
                    }
                }
                break;
                }
            }
        
        // return s;
        return 0;

    }
}
