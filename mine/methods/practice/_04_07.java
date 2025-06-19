public class _04_07 {

    static void patter_iter(int rows){
        for(int i=0; i<rows; i++){
            for(int j=rows; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void pattern_recur(int rows){
        if(rows>0){
            for(int j=0; j<rows; j++){
                System.out.print("* ");
            }
            System.out.println();
            pattern_recur(rows-1);
    }
    }

    public static void main(String[] args) {
        
        // patter_iter(4);
        pattern_recur(4);
    }
}
