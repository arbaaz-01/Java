public class VarArgs {
    
    // static int add(int a, int b){
    //     return a + b;
    // }
    // static int add(int a, int b, int c){
    //     return a + b + c;
    // }
    // static int add(int a, int b, int c, int d){
    //     return a + b + c + d;
    // }

    static int add(int b, int...arr){
    // static int add(int...arr){
        int result = b;
        // int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    

    public static void main(String[] args) {
        // System.out.println(add(1, 2));
        // System.out.println(add(1, 2, 3));
        // System.out.println(add(1, 2, 3, 4));

        System.out.println(add(1, 4, 2,45, 242, 1213,12));
        System.out.println(add(3, 45));
        System.out.println(add(1));
        // System.out.println(add(1));
    }
}
