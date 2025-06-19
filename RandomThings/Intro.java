class Hello {
    public void h() {
        System.out.println("Java");
    }
}

public class Intro {
    static void greet(){
        System.out.println("Method");
    }
    public static void main(String[] ahr) {
        
        // String str = ahr[0];

        // int a = Integer.parseInt(ahr[0]);
        // int b = Integer.parseInt(ahr[1]);

        // System.out.println(str);
        // System.out.printf("Addition of %d and %d is: %d", a, b, a+b);

        // Hello.h();
        Hello h = new Hello();
        h.h();

        greet();
        

        for(String el:ahr){
            System.out.println(el);
        }
    }
}
