public class _11_logical_op {
    public static void main(String[] args) {
        // System.out.println("For logical AND");
        // boolean a = true;
        // boolean b = true;
        // boolean c = false;
        // if(a && b && c){
        //     System.out.println("Y");
        // }
        // else{
        //     System.out.println("N");
        // }

        System.out.println("For logical OR");
        boolean a = true;
        boolean b = false;
        boolean c = false;
        if(a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println(!a);
        System.out.println(!b);
    }
}
