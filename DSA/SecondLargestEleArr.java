import java.util.Arrays;

public class SecondLargestEleArr {

    public static int bruteApp(int[] arr){
        Arrays.sort(arr);
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]  != arr[arr.length-1]){
                return arr[i];
            }
        }
        return -1;
    }

    public static int betterApp(int[] arr){
        int max = arr[0], secondMax = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static int optimalApp(int[] arr){
        int largest = arr[0], secondLargest = -1;
        for(int i=0; i<arr.length; i++){
            // if(arr[i] > largest && arr[i] != largest){
            //     secondLargest = largest;
            //     largest = arr[i];
            // }

            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int [] arr = {23, 89, 100, 45, 13, 10, 100, 89};
    //  10 13 23 45 89 89 100 100
        int res = SecondLargestEleArr.bruteApp(arr);
        System.out.println(res);

        System.out.println(SecondLargestEleArr.betterApp(arr));
        
        System.out.println(SecondLargestEleArr.optimalApp(arr));
    }
}
