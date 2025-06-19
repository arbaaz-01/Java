class SearchAlgo {
    int BinarySearch(int[] lst, int num){
        int start = 0, end = lst.length - 1;
        while(start <= end){
            int mid=(start + end) /2;
        if(lst[mid] == num){
            return mid;
        }
        if(lst[mid] < num){
            start = mid + 1;  
        }
        else{
            end = mid - 1;
        }
    }
    return -1;
    }

    static int BinarySearchRecursion(int[] lst, int num, int low, int high){

        while(low <= high){
            int  mid = (low + high) /2;
            if(num == lst[mid]){
                return mid;
            }
            if (num> lst[mid]){
                return BinarySearchRecursion(lst, num, mid + 1, high);
            }
            else{
                return BinarySearchRecursion(lst, num, low, mid-1);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] lst = {12, 34, 78, 109, 130, 150};
        int count = 0;
        for(int ele: lst){
            count++;
        }
        System.out.println(count);
        // System.out.println(lst[0]);

    //     int [] arr = new int[10000];               
    //     for (int a = 0; a < arr.length; a++) {
    //         arr[a] = a + 1;
    // }
    //     int srch = 9890;
    //     SearchAlgo s = new SearchAlgo();
    //     int res = s.BinarySearch(arr, srch);
    //     System.out.println(res);

    //     System.out.println(arr[9889]);

    int res = BinarySearchRecursion(lst, 150, 0, lst.length-1);
    // System.out.println(res);
    }
}
