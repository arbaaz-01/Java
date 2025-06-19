
public class DateTime_06 {
    public static void main(String[] args) {
        
        // Date d = new Date();
        // System.out.println(d);

        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        
        System.out.println("Minutes since 1970 " + System.currentTimeMillis()/1000/60);

        System.out.println("Hours since 1970 " + System.currentTimeMillis()/1000/60/60);
    }
}
