public class SubArray {
    
    public static void subArr(int[] arr){

        int len = arr.length;
        
        for(int i=0; i<len; i++){
            for(int j=i; j<len; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4};

        subArr(arr);
    }
}
