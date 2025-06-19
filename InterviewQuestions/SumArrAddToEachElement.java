public class SumArrAddToEachElement {
    public static void sumArrEle(int[] arr){
        int len = arr.length;
        int sum = 0;
        for(int i=0; i<len; i++){
            sum += arr[i];
        }
        // System.out.println(sum);
        for(int j=0; j<len; j++){
            arr[j] += sum;
            System.out.print(arr[j] + " ");
        }
    }

    public static void upperCountry(String [] sarr){
        int len = sarr.length;
        for(int i=0; i<len; i++){
            System.out.print(sarr[i].toUpperCase());
            if(i!=len-1){
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50};  //150 
        sumArrEle(arr);
        System.out.println();

        String [] sarr = {"USA", "Japan", "France", "Italy", "India", "Canada"};
        upperCountry(sarr);

    }

}
