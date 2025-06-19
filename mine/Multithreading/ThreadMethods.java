class TT extends Thread{
    TT(String name){
        super(name);
    }
    public void run(){
        int i=0;
        // while(i<100){
            while(true){
        System.out.println("Threaddd "+this.getName());
        try{
            Thread.sleep(00);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        i++;
        }
    }
}
class TT2 extends Thread{
    TT2(String name){
        super(name);
    }
    public void run(){
        int i=0;
        // while(i<100){cls
            
            while(true){
        System.out.println("Ryzenn "+this.getName());
        i++;
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        TT t = new TT("T1");
        TT t1 = new TT("T2");
        TT2 tt = new TT2("SSS");
        t.start();
        // try{
        //     t.join();
        // }catch(Exception e){
        //     System.out.println(e);
        // }
            // t1.start();
            tt.start();
    }
}
