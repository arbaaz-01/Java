public class _08 {
    public static void main(String[] args) {
        int [] arr1 = {2, 3, 1, 4, 1};
        int [] arr = {1, 10, 100};

        // int temp = arr[0];
        // boolean sort = false;
        // for(int i=1; i<arr.length; i++){
        //     if(temp<arr[i]){
        //         temp = arr[i];
        //         sort = true;
        //     }
        //     else{
        //         sort = false;
        //         break;
        //     }
        // }
        // if(sort){
        //     System.out.println("Sorted Array");
        // }
        // else{
        //     System.out.println("Unsorted Array");
        // }


        boolean isSorted = true;
        for(int j=0; j<arr.length-1; j++){
            if(arr[j] > arr[j+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Sorted Array");
        }
        else{
            System.out.println("Unsorted  Array");
        }
    }
}
