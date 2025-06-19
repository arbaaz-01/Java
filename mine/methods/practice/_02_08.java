public class _02_08 {

    static void pattern(int rows){
        for(int i =0; i<rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_recur(int rows){
        if(rows>0){
            pattern_recur(rows -1);
            for(int i=0; i<rows; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        // pattern(4);

        pattern_recur(4);
    }
}
