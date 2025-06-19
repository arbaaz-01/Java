public class _06_07 {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,4,4};
        if(arr.length>0){
            int max = arr[0];
            int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            else if(arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println("Using for loop Max Val " + max);
        System.out.println("Using for loop Min Val " + min);
    }

        int m = arr[0];
        for(int e:arr){
            if(e>m){
                m = e;
            }
        }
        System.out.println("Using for each loop "+ m);
    }
}
