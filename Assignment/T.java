class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Thread is Running..");
            // System.out.println("Awesomeee!!");
            i++;
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        int j = 0;
        while (j < 50) {
            System.out.println("Thread2 is Executing..");
            // System.out.println("Woww!!");
            j++;
        }
    }
}
public class T {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2 = new MyThread2();

        mt1.start();
        mt2.start();
    }
}
