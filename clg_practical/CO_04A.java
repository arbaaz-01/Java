class Rectangle1{
    java.util.Scanner sc = new java.util.Scanner(System.in);
    private float length, breadth;
    public void getData(){
        System.out.print("Enter length: ");
        this.length = sc.nextFloat();
        System.out.print("Enter breadth: ");
        this.breadth = sc.nextFloat();
    }
    public float area(){
        return this.length * this.breadth;
    }
}
public class CO_04A {
    public static void main(String[] args) {        
        Rectangle1 obj = new Rectangle1();
        obj.getData();
        System.out.printf("Area: %f sq unit",obj.area());    
    }
}
