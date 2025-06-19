package CalC;
class Calculator{
    public static void add(int a, int b){
        System.out.println(a + b);
    }
}
class ScCalculator{
    public void sub(int a, int b){
        System.out.println(a - b);
    }
}
class HybridCalculator{
    public void multi(int a, int b){
        System.out.println(a * b);
    }
}

public class Pro_01 {
    public static void main(String[] args) {
        System.out.println("Main method");
        Calculator.add(2, 9);
    }
}
