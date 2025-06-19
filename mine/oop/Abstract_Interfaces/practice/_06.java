interface SmartTvRemote{
     void on();
     void off();
}
interface TvRemote extends SmartTvRemote{
     void volume();
     void changeChannel();
}
class TV implements TvRemote{
    public void netflix(){
        System.out.println("netflix and chill...");
    }
    public void volume(){
        System.out.println("increase sound...");
    }
    public void changeChannel(){
        System.out.println("changing channel...");
    }
    public void on(){
        System.out.println("Turning tv on");
    }
    public void off(){
        System.out.println("Turning tv off");
    }
}
public class _06 {
    public static void main(String[] args) {
        TV t = new TV();
        t.volume();
        t.changeChannel();
        t.on();
        t.off();

        SmartTvRemote st = new TV();
        st.on();
        st.off();
        // st.volume();

        TvRemote tv = new TV();
        tv.changeChannel();
        tv.volume();
        tv.off();
        // tv.netflix();
    }
}
