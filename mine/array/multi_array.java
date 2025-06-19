public class multi_array {
    public static void main(String[] args) {
        

        int [] marks;       //1-D Array

        int [][] flats;     //2-D Array

        flats = new int[4][4];
        flats[0][0] = 1001;
        flats[0][1] = 1002;
        flats[0][2] = 1003;
        flats[0][3] = 1004;
        
        flats[1][0] = 2001;
        flats[1][1] = 2002;
        flats[1][2] = 2003;
        flats[1][3] = 2004;
        
        flats[2][0] = 3001;
        flats[2][1] = 3002;
        flats[2][2] = 3003;
        flats[2][3] = 3004;
        
        flats[3][0] = 4001;
        flats[3][1] = 4002;
        flats[3][2] = 4003;
        flats[3][3] = 4004;

        System.out.println(flats[3][2]);
        // Multidimensional Array
        System.out.println(flats.length);
        for(int i=0; i<flats.length; i++){
            for(int j = 0; j <flats[i].length; j++){
                System.out.print(flats[i][j]); 
                System.out.print(" ");
            }
            System.out.println();   
        }

        // for(int element: flats){
        //     System.out.println(element);
        // }


    }
}
