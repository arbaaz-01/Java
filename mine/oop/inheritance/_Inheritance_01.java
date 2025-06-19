
class Base{
    int x;
    Base(){
        // System.out.println("I M Constructor");
    }
    void setX(int x){
        System.out.println("From base class setting x now");
        this.x = x;
    }
  public int getX(){
    return x;
  }
}

class Derived extends Base{
    // void display(){
    //     setX(10);
    //     System.out.println(getX());
    // }
    int y;
    void setY(int y){
        this.y = y;
    }
    void getY(){
        System.out.println(this.y);
    }
    
}

public class _Inheritance_01 {
    public static void main(String[] args) {
        
       Base b = new Base();
       b.setX(10);
       System.out.println(b.getX());
        
        Derived n = new Derived();
        // n.display();
        n.setX(189);
        System.out.println(n.getX());
        n.setY(10000);
        n.getY();
    }
}
