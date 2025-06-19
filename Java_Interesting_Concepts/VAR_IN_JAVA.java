public class VAR_IN_JAVA{

    public static void main(String[] args){
        
        // System.out.println(args[0]);
        // System.out.println(args[1]);

        // int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);

        // System.out.println(a+b);

        // String s = String.valueOf(a);
        // System.out.println(s);


        // VAR
        // From Java 10 oracle has introduced var keyword for variables like in JavaScript
        // Will work in Java version >= 10
        // Can be used for local variables (Inside methods)  
        var num = 100;
        var num1 = 10.23;
        var st = "arbaz";
        var bool = true;
        var l=293874292;
        var d = 29408.21948712;

        System.out.println(num);
        System.out.println(num1);
        System.out.println(st);
        System.out.println(bool);
        System.out.println(l);
        System.out.println(d);

        System.out.println(num+num1);

    }
}