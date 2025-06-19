public class MatricesMulti_08_A {
    public static void main(String[] args) {
        int [][] arr1 = {{3, 5, 2}, {9, 4, 3}, {1, 4, 2}};
   
        int [][] arr2 = {{6, 2, 7}, {2, 1, 10}, {2, 8, 1}};

        int [][] multiArr = new int[arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                multiArr[i][j] = 0;
                for(int k=0; k<arr2.length; k++){
                    multiArr[i][j] += arr1[i][k] * arr2[k][j];
                }
                System.out.print(multiArr[i][j]+" ");
            }
            System.out.println();
        }

        // for(int i=0; i<multiArr.length; i++){
        //     for(int j=0; j<multiArr[i].length; j++){
        //         System.out.print(multiArr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

    }

}

