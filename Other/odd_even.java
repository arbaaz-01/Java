class odd_even{
    public static void main(String[] args) {
        int [] arr = {2, 5, 6, 90, 45, 2, 44};
        int even = 0, odd = 0;
        for(int i=0; i<arr.length; i++){
            if((arr[i] % 2) == 0){
                even += 1;
            }
            else{
                odd +=1;
            } 
        }
        System.out.println("Total even numbers in array: "+ even);
        System.out.println("Total odd numbers in array: "+ odd);
    }
}