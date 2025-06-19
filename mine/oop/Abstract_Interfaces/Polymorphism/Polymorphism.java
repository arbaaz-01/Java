interface Camera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Hello Sir/Madam");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording 4k video...");
    }
}
interface Wifi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class CellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class SmartPhone2 extends CellPhone2 implements Camera2, Wifi2{
    public void takeSnap(){
        System.out.println("Taking Snap...");
    }
    public void recordVideo(){
        System.out.println("Taking Video...");
    }
    // public void record4kVideo(){
    //     System.out.println("Overriding...");
    // }
    public String[] getNetworks(){
        System.out.println("Availabe Networks...");
        String[] networkList = {"Arbaz", "Ali", "Shaikh"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to network...");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
       Camera2 c = new SmartPhone2();
    //    c.getNetworks(); --> Not allowed only camera methods are allowed
    c.takeSnap();
    c.record4kVideo();
    c.recordVideo();

    }

}
