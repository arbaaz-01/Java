public class LargestSmallest_3A {
    public static void main(String[] args) {
        int [] arr = new int[] {-90, 0, 100, 89, 578};

        if(arr.length>0){
        int largest = arr[0];
        int smallest = arr[0];
        for(int j=1; j<arr.length; j++){
            if(arr[j] > largest){
                largest = arr[j];
            }
            else if(arr[j] < smallest){
                smallest = arr[j];
            }
        }
        System.out.println("Largest: "+largest);
        System.out.println("Smallest: "+smallest);
    }
    else{
        System.out.println("Null Array");
    }
    }
}
