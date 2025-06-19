public class Sixth_06 {
    public static void main(String[] args){

        int a = 6*5-34/2;
        /*
         * = 30 - 34/2
         * = 30 - 17
         * = 13
         */
        // Precedence & Associativity
        System.out.println(a);

        int b = 60/5-34*2;
        /*
         * = 12-68
         * = -56
         */
        System.out.println(b);

        int x = 20, y = 10, z;
        z = (x-y)/2;
        System.out.println(z);

        int aa=2, bb = 0, c=0, d;
        d = ((bb*bb) - (4*aa*c)) /(2*aa);
        System.out.println(d);

        int v = 3, u = 4;

        System.out.println(v*v - u*u);

        int p=2, q=3, r=5;
        System.out.println(p * q - r);
    }
}
