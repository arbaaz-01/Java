abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    public void write(){
        System.out.println("Writing a pen...");
    }
    public void refill(){
        System.out.println("Refilling the pen...");
    }
    public void changeNib(){
        System.out.println("Changing nib...");
    }
}
public class _01_02 {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();

        Pen p = new FountainPen();
        p.write();
        p.refill();
        // p.changeNib();           --> Can't be called as it is not defined in abstract class.
    }
}
