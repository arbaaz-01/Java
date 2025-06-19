class Circle{
    public double radius;
    Circle(){
        System.out.println("Non param const of circle class");
    }
    Circle(double radius){
        this.radius = radius;
        System.out.println("Circle class constructor parameterized");
    }

    public double area(){
        return Math.PI * this.radius * this.radius;
    }
    public double perimeter(){
        return 2 * Math.PI * this.radius;
    }
}

class Cylinder extends Circle{
    public double height;
    Cylinder(double r, double h){
        super(r);
        this.height = h;
        System.out.println("Cylinder class constructor parameterized");
    }
    public double volume(){
        return Math.PI * this.radius * this.radius * this.height; 
    }
}

public class _01_Inheritance {
    public static void main(String[] args) {
        
        Cylinder c = new Cylinder(3, 4);
        System.out.println("Area of Circle: " + c.area());
        System.out.println("Perimeter of Circle: " + c.perimeter());
        System.out.println("Volume of Cylinder: " + c.volume());
    }
}
