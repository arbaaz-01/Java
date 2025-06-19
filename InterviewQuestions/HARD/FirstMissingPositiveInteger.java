import java.util.Arrays;

public class FirstMissingPositiveInteger{

    public static void main(String[] args) {
        
            int[] arr = {3,4,-1,1};
            // -1 1 3 4


            // 3

            int min = arr[0], max = arr[0];

            Arrays.sort(arr);
            // for(int ele: arr ){
            //     System.out.println(ele);
            // }

            for(int i=arr[0]; i<arr.length-1; i++){
                if(arr[i+1] - arr[i] > 1){
                    System.out.println(arr[i] + 1);
                }
            }

            System.out.println(arr.length);
            

            


    }
}