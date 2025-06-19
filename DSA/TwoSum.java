public class TwoSum {
    public static void main(String[] args) {
        
        int [] arr = {3, 2, 4};
        // Target = 9
        int target = 9;

        for(int i=0; i < arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j]==target){
                    System.out.println(i + " " + j);
                }
            }
        }

        String s = "arbaaz";
        String a="";
        a += s.concat("helllo");

        System.out.println(s.charAt(10));
        System.out.println(a);
    }
}
