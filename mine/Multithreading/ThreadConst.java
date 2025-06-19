class MyTh extends Thread{
    MyTh (String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<2){
            System.out.println("I am a thread");
            i++;
        }
    }
}

class MyTh2 implements Runnable{
 
    public void run(){
        System.out.println("Threadripper");
    
    }
}

public class ThreadConst {
    public static void main(String[] args) {
        MyTh t = new MyTh("arbaaz");
        MyTh t2 = new MyTh("arbaaz");
        // t.start();
        // t2.start();
        // System.out.println("The id of thread "+t.getId());
        // System.out.println("The name of thread "+t.getName());

        // System.out.println("The id of thread "+t2.getId());
        // System.out.println("The name of thread "+t2.getName());

        MyTh2 mt = new MyTh2();
        Thread mtt = new Thread(mt, "ali");

        mtt.start();
        System.out.println("Thread id: "+mtt.getId());
        System.out.println("Thread name: "+mtt.getName());
    }
}
