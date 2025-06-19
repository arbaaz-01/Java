
public class _01 {
    public static void main(String[] args) {
        
        // int [][] arr;
        // arr = new int[2][3];
        // arr[0][0] = 2;
        // arr[0][1] = 1;
        // arr[0][2] = 2;
        // arr[1][0] = 2;
        // arr[1][1] = 1;
        // arr[1][2] = 2;

        // int [][] arr = {{2,1,2},{2,1,2}};

        int [][] arr = new int[2][3];
        arr[0][0] = 2;
        arr[0][1] = 1;
        arr[0][2] = 2;
        arr[1][0] = 2;
        arr[1][1] = 1;
        arr[1][2] = 2;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }    
}
