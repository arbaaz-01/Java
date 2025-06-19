public class EvenOddArray {
    public static void main(String[] args) {
        
        int[] arr = {23, 90, 20, 11, 15, 19, 100};
        int [] arr2 = new int[arr.length];

        int ind=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2==0){
                arr2[ind] = arr[i];
                ind++;
            }
        }
        for(int j=0; j<arr.length; j++){
            if(arr[j] % 2 !=0){
                arr2[ind] = arr[j];
                ind++;
            }
        }

        // System.out.println(arr2);
        for(int ele:arr2){
            System.out.print(ele + "  ");
        }


    }
}
