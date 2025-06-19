abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void lift(){
        System.out.println("Lifting...");
    }
    public void disconnect(){
        System.out.println("Disconnecting...");
    }

    public void connect(){
        System.out.println("Connecting...");
    }
}

public class _04 {
    public static void main(String[] args) {
        Telephone t = new SmartTelephone();
        t.ring();
        t.lift();
        t.disconnect();
        // t.connect();

        SmartTelephone s = new SmartTelephone();
        t.ring();
        t.lift();
        t.disconnect();
        s.connect();

    }
}

