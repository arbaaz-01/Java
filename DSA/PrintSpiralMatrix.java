import javax.sound.sampled.SourceDataLine;

public class PrintSpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 2, 3, 4 },
                           { 5, 10, 9 },
                           { 6, 1, 11 } };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // System.out.print((matrix[i][j]) + " ");
            }
            // System.out.println();
        }

        System.out.print(matrix[0][0]+" ");
        System.out.print(matrix[0][1]+" ");
        System.out.print(matrix[0][2]+" ");
        System.out.print(matrix[1][2]+" ");
        System.out.print(matrix[2][2]+" ");
        System.out.print(matrix[2][1]+" ");
        System.out.print(matrix[2][0]+" ");
        System.out.print(matrix[1][0]+" ");
        System.out.print(matrix[1][1]);
    }

}