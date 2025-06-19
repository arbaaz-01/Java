
class Cellphone{
   /* public String m1(){
        String r = "Ringing...";
        return r;
    }
    public String m2(){
        String r = "Vibrating...";
        return r;
    }
    */
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void calling(){
        System.out.println("Calling my life..");
    }
}

public class _02 {
    public static void main(String[] args) {
        
        Cellphone c1 = new Cellphone();
        c1.ringing();
        c1.vibrating();
        c1.ringing();


    }
}
