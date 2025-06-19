public class Logical {
    public static void main(String[] args) {
        float a = 20;
        float b = 10;
        float e = 100;
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
    }
}
