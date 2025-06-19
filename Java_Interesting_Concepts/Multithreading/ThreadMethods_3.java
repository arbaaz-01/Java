public class ThreadMethods_3 {
    public static void main(String[] args) {
        
        System.out.println("Main executuin started...");

        Thread th  = Thread.currentThread();

        String tname = th.getName();

        System.out.println("Thread: " + tname);

        th.setName("MyMain");
        System.out.println("Thread: " + th.getName());

        try{Thread.sleep(2000);} catch(Exception e){};
        

        System.out.println(th.getId());

        Th t = new Th();
        t.start();
        System.out.println("Main executuin ended...");
    }
}

class Th extends Thread{
    public void run(){
        System.out.println("User thread");
    }
}