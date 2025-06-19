class MyRunnableThread1 implements Runnable{
    public void run(){
        int i=0;
        while(i<10){
        System.out.println("I am a thread 1");
        i++;
    }
    }
}
class MyRunnableThread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<10){
        System.out.println("I am a thread 2");
        i++;
        }
    }
}
public class RunnableT{
    public static void main(String[] args) {
        MyRunnableThread1 b1 = new MyRunnableThread1();
        Thread g1 = new Thread(b1);
        MyRunnableThread2 b2 = new MyRunnableThread2();
        Thread g2 = new Thread(b2);
        g1.start();
        g2.start();
    }
}
