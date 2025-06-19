class Super{
    int x;
    Super(int x){
        this.x = x;
    }
    void display(){
        System.out.println("Super x " + x);
    }
}
class Sub extends Super{
    int y;
    Sub(int x, int y){
        super(x);
        this.y = y;
    }
    void display(){
        System.out.println("Super x = "+x);
        System.out.println("Sub y = "+ y);
    }
}

public class Overriding {
    public static void main(String[] args) {
        Sub obj = new Sub(2,  3);
        obj.display();
    }
}
