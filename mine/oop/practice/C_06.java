class Circle{
    double radius;

    public double area(){
        return Math.PI  * radius * radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}


public class C_06 {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.radius = 3;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        
        
    }
}