public class Seventh_07 {
    public static void main(String[] args) {
        
        byte x = 4;
        int y = 4;
        short z = 6;
        int r = x + y;
        int a = 56 + 12;
        float b = 5.45f + 8;
        // System.out.println(r);

        // Increment and Decrement Operators

        int i = 66;
        System.out.println(i++);
        System.out.println(i);
        int k = 43;
        System.out.println(++k);
        System.out.println(k);

        int ab = 3;
        int bc = ab++;
        System.out.println(bc);

        int cd = 3;
        int de = ++cd;
        System.out.println(de);


        int m = 7;
        int n = ++m * 8;
        System.out.println(n);

        char q = 'A';
        System.out.println(q++);  //q is now B
        System.out.println(q);
    }
}
