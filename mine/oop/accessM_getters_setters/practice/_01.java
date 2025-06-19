// package practice;
class Sphere{
    private int radius;
    void setR(int r){
        this.radius = r;
    }
    int getR(){
        return this.radius;
    }
}
class Rectangle{
    private int length;
    private int width;
    Rectangle(){
        this.length = 4;
        this.width = 5;
    }
    Rectangle(int l, int w){
        this.length = l;
        this.width = w;
    }
    void display(){
        System.out.printf("Lenght: %d\nWidth %d\n",length, width);
    }

}
class Cylinder{
    private int radius;
    private int height;

    Cylinder(int r, int h){
        if(r<=0 || h<=0){
            System.out.println("Not acceptable");
        }
        else{
        this.radius = r;
        this.height = h;
        }
    }
    // void setRadHt(int r, int h){
    //     if(r<=0 || h<=0){
    //         System.out.println("Not acceptable");
    //     }
    //     else{
    //     this.radius = r;
    //     this.height = h;
    //     }
    // }
    void getRadHt(){
        if(radius<=0 || height<=0){
            ;
        }
        else{
        System.out.printf("Radius is: %d\nHeight is: %d\n",radius, height);
        }
    }

    public double surfArea(){
        return (2 * 3.14 * radius * height) + (2 * 3.14 * radius * radius);
    }

    public double volume(){
        return Math.PI * radius * radius * height;
    }
} 
public class _01 {
    public static void main(String[] args) {

        Cylinder c = new Cylinder(12, 14);
        // c.setRadHt(5, 10);
        c.getRadHt();
        System.out.println("Surface Area: " + c.surfArea());
        System.out.println("Volume: " + c.volume());   
        
        Rectangle r = new Rectangle(11,111);
        r.display();
        Rectangle r1 = new Rectangle(10, 19);
        r1.display();

        Sphere s = new Sphere();
        s.setR(10);
        int res = s.getR();
        System.out.printf("Radius is: %d",res);
        
        
    }
}
