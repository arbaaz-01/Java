
public class _02 {
    public static void main(String[] args) {
        
        int [][] table = new int[5][5];

        for(int i=0; i<table.length; i++){
            for(int j=0; j<table[i].length; j++){
                if(table[i] == table[j]){
                    table[i][j] = 1;
                }
                else{
                    table[i][j] = 0;
                }
                System.out.print(table[i][j] + "   ");
            }
            System.out.println();
        }

    }
}
