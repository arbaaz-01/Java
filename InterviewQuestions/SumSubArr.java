public class SumSubArr {
    
    public static int countSum(int[] arr){
        int len = arr.length;

        int sum = 1;
        int res = 0;

        for(int i=0; i<len; i++){
    
            for(int j=i; j<len; j++){
                int s = 0; 
                for(int k=i; k<=j; k++){
                    s = s + arr[k];
                    // System.out.print(arr[k] + " ");
                }
                if(s == sum){
                    res++;
                }
                // System.out.println();
            }
        }
        return res;
    }



    public static void main(String[] args) {
        
        int[] arr = {1, 1, 1};
        
        // 1  
        // 1 2  -> 3
        // 1 2 3  -> 6
        // 2
        // 2 3
        // 3    -> 3
        int r = countSum(arr);
        System.out.println(r);
    }
}
