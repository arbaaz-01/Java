import java.util.Arrays;
public class SecondLargestElement{

    public static void print2largest(int[] arr){
        int size = arr.length;
        if(size<2){
            System.out.println("Invalid Array");
            return;
        }
        Arrays.sort(arr);
        // if(arr[size-1] == arr[size-2]){
        //     System.out.println("Seconf Largest Element: "+arr[size-3]);
        //     return;
        // }
        // System.out.println("Second Largest Element: "+arr[size-2]);

        for(int i=size-2; i>=0; i--){
            if(arr[i] != arr[size-1]){
                System.out.println("Second Largest Element: "+ arr[i]);
                return;
            }
        }
        System.out.println("No second largest element");
        return;
    }

    public static void main(String[] args) {

        // 8 23 90 90 199 199
        int[] arr = {23, 23, 23, 23, 23, 23, 23};
        // int[] arr = {23};
        // int[] arr = {23, 34, 90, 12, 90, 90, 100, 90};
        // int[] arr = {23, 21, 89, 90, 11, 10};
        print2largest(arr);
    }
}