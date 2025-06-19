class Rectangle{
    public int length, width;
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area(){
        return this.length * this.width;
    }

}
class Cuboid extends Rectangle{
    int height;
    Cuboid(int l, int w, int h){
        super(l, w);
        this.height = h;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int volume(){
        return this.width * this.height * this.length;
    }

    
}



public class _02_Inheritance {
    public static void main(String[] args) {

        Cuboid c = new Cuboid(6, 4, 3);
        c.setLength(10);
        c.setWidth(10);
        c.setHeight(10);
        System.out.printf("Area of cirlce is %d sq unit\n",c.area());
        System.out.println(c.volume());        
    }
}
