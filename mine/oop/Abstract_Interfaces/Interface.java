// package Abstract_Interfaces;

interface Bicycle{
    int a = 90;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface FeatBicycle{
    int b = 100;
    void lightOn();
    void lightOff();
}

class MyCycle implements Bicycle, FeatBicycle{
    int speed = 5;
    // int a =190;
    public void applyBreak(int decrement){
        System.out.println("Applying Brake...");
        speed -= decrement;
    }
    public void speedUp(int increment){
        System.out.println("Speeding Up...");
        speed += increment;
    }
    public void lightOn(){
        System.out.println("Light up Light up skechers");
    }
    public void lightOff(){
        System.out.println("Lighting Off");
    }
}

public class Interface {
    public static void main(String[] args) {
        MyCycle c = new MyCycle();
        c.applyBreak(2);
        c.speedUp(3);
        System.out.println(c.speed);
        c.lightOn();
        c.lightOff();
        // You can create properties in interfaces
        // You cannot modify the properties of interfaces
        // c.a=9000;
        // c.b=9000;
        System.out.println(c.a);



        // final int a = 10;
        // System.out.println(a);
        // a = 78;

    }
}
