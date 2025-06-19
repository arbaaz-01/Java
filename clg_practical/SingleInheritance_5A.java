class Rectangle{
    float lenght;
    float breadth;
    Rectangle(float l, float b){
        this.lenght = l;
        this.breadth = b;
    }
    float area(){
        return this.lenght * this.breadth;
    }
}
class Cuboid extends Rectangle{
    float height;
    Cuboid(float l, float b, float h){
        super(l, b);
        this.height = h;
    }
    float volume(){
        return this.lenght * this.breadth * this.height;
    }
}
public class SingleInheritance_5A {
    public static void main(String[] args) {
        System.out.println("--Single Inheritance--");
        Cuboid obj = new Cuboid(4, 2, 5);
        System.out.printf("Area: %f sq unit\n", obj.area());
        System.out.printf("Volume: %f cubic unit", obj.volume());
    }
}
