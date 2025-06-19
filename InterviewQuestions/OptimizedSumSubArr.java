public class OptimizedSumSubArr {
    
    public static void subArrCount(int[] arr){
        int n = arr.length;
        int k = 2;
        int res = 0;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
                if(sum == k){
                    res++;
                }
            }
        }
        System.out.println("The subarry that sum count "+k+ " is: "+res);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1};
        subArrCount(arr);
    }
}
