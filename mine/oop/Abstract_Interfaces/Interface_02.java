interface Camera{
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
interface Wifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class SmartPhone extends CellPhone implements Camera, Wifi{
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
public class Interface_02 {
    public static void main(String[] args) {
        SmartPhone mySmartPhone = new SmartPhone();
        String [] ar = mySmartPhone.getNetworks();
        for(String e:ar){
            System.out.println(e);
        }
        mySmartPhone.record4kVideo();
        // mySmartPhone.greet();
    }

}
