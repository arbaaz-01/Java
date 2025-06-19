class Method{
    public  void myMethod(){
        System.out.println("Method without parameter");
    }
    // public int myMethod(int num1, int num2){
    //     return num1 + num2;
    // }
    public void myMethod(int x){
        System.out.println("Method int parameter " + x);
    }
    public void myMethod(float y){
        System.out.println("Method float parameter "+ y);
    }
    public void myMethod(String s){
        System.out.println("Method String parameter " + s );
    }
}
public class Overloading_06_A {
    public static void main(String[] args) {

        Method obj = new Method();
        obj.myMethod();
        // System.out.println(obj.myMethod(12, 18));
        obj.myMethod(12);
        obj.myMethod(12.67f);
        obj.myMethod("Hello");

    }
}




// class A{
//     void m1(){
//         System.out.println("hello world");
//     }
// }
// class B extends A{
//     void m1(){
//         System.out.println("hello earth");
//     }
// }

// class Main{

//     public static void main(String[] args) {
//         B b = new B();
//         b.m1();
//     }
// }
