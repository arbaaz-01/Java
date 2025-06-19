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

    public void setHeight(int length, int width, int height) {
        this.height = height;
    }

    int volume(){
        return this.width * this.height * this.length;
    }

    
}



public class _02_Inheritance {