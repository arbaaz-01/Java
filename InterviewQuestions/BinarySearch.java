public class BinarySearch {
    
    public static int binarySearch(int start, int end, int key, int [] arr){
        while(start <= end){
            int mid = (start + end)/2;
            if(key == arr[mid]){
                return mid;
            }
            if(key > arr[mid]){
                return binarySearch(mid+1, end, key, arr);
            }
            else{
                return binarySearch(start, mid-1, key, arr);
            }

        }
        return -1;
    }



    public static void main(String[] args) {
        
        int [] arr = {23, 50, 100, 550, 1000};
        int key = 100;

        int len = arr.length;

        int res = binarySearch(0, len-1, key, arr );

        System.out.println("Index: "+ res);
        System.out.println(arr[res]);
        
    }
}
