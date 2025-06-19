public class _03 {
    public static void main(String[] args) {
        
        int row = 10;
        int col = 10;

        int[][] multiTable = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                multiTable[i][j] = (j+1)*(i+1);
                System.out.print(multiTable[i][j] + " ");
             }
             System.out.println();
        }
    }
}
