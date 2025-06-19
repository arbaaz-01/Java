public class ProdArrWithoutSelf {
    public static void main(String[] args) {
        
        // Input: nums = [1,2,3,4]
        // Output: [24,12,8,6]

        // Input: nums = [-1,1,0,-3,3]
        // Output: [0,0,9,0,0]

        int [] nums = {-1, 1, 0, -3, 3};
        int [] res = new int[nums.length];

        int count = 0;
        int mult;
        for(int i=0; i<nums.length; i++){
            mult=1;
            for(int j=0; j<nums.length; j++){

                if(count == j) continue;
                mult *= nums[j];
            }
            res[i] = mult;
            count++;
        }


        for(int ele:res){
            System.out.print(ele +" ");
        }
    }
}
