
public class Operators_02_a {
    public static void main(String[] args) {
        System.out.println("--Arithmetic Operators--");
        int a = 10, b = 3, e= 5;
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));
        System.out.println("Modular Div: "+(a%b));

        System.out.println();
        System.out.println("--Relational Operators--");
        System.out.println("a>b:  " + (a>b));
        System.out.println("a<b:  " + (a<b));
        System.out.println("a>=b: " + (a>=b));
        System.out.println("a<=b: " + (a<=b));
        System.out.println("a==b: " + (a==b));
        System.out.println("a!=b: " + (a!=b));

        System.out.println();
        System.out.println("--Logical and Bitwise Operator--");
        System.out.println("AND: " + (a<b&&a<e));
        System.out.println("Bitwise AND: " + (a<b&a<e));
        System.out.println("AND: " + (a<b&&a++<e));
        System.out.println(a);
        System.out.println("OR: " + (a<b||a<e));
        System.out.println(a);
        System.out.println("OR: " + (a>b||a<e));
        System.out.println("Bitwise OR: " + (a>b|a<e));
        System.out.println("OR: " + (a>b||a++<e));
        System.out.println("Bitwise OR: " + (a>b|a++<e));
        System.out.println(a);

        System.out.println();
        System.out.println("--Assignment and Shorthand Assignment operator--");
        int x = 4, y=2;  // = assignment operator
        System.out.println(x += 1);  // x = x + 1
        System.out.println(x /= y);  // x = x/y
        System.out.println(y -= 1);  // y = y - 1
        System.out.println(y *= x);  // y = y * x
        System.out.println(x %= y+1); // x = x % (y+1)
        System.out.println("x = " + x + " y = "+ y);
        System.out.println(x &= y);
        System.out.println(x |= 3);
        System.out.println(y >>= 2);
        System.out.println(x <<= 2);
        System.out.println("x = " + x);
        System.out.println(x >>>= 2);

        int i = 3, j = 0;
        System.out.println();
        System.out.println("--Increment Decrement--");
        System.out.println("i = "+ i + " & j = "+ j);
        System.out.println("i++ "+ i++);  
        System.out.println("i = " +i);
        System.out.println("++j " + (++j));  // j = j + 1
        System.out.println("i = "+ i + " & j = "+ j);
        System.out.println("i-- " + i--);
        System.out.println("i = " + i);
        System.out.println("--j " + (--j));

        System.out.println();
        System.out.println("--Conditional Operator--");
        int z = 3;
        String zz = (z % 2)==0 ? z + " is even": z + " is odd";
        System.out.println(zz);
    }    
}
