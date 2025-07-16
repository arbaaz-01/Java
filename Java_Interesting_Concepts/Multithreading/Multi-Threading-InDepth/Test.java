public class Test{
    public static void main(String[] args) {

        Counter counter = new Counter();

        MyThread mt1 = new MyThread(counter);
        MyThread mt2 = new MyThread(counter);

        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);

        t1.start();
        t2.start();
        
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(counter.getCount());

        System.out.println("Main Done");
    }
}