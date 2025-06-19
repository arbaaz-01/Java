public class _04 {
    public static void main(String[] args) {
        
        int [][] arr1 = { {2, 1, 4}, 
                          {4, 2, 3} };
        
        
        int [][] arr2 = { {2, 3, 1}, 
                          {4, 2, 1} };
                          
        int [][] res = { {0, 0, 0}, 
                         {0, 0, 0} };

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                res[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[i].length; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}
