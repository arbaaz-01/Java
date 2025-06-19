class T1 extends Thread{
    T1(String name){
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        // while(i<100){
            while(true){
            System.out.println("Thread yesss "+this.getName());
            i++;
        }
    }
}
// class T2 extends Thread{
//     @Override
//     public void run(){
//         int i=0;
//         while(i<20){
//             System.out.println("Thread Noo");
//             i++;
//         }
//     }
// }

public class ThreadPriority {
    public static void main(String[] args) {
        T1 t1 = new T1("arbaz 1");
        T1 t2 = new T1("arbaz 2");
        T1 t3 = new T1("arbaz 3 (Most Important)");
        T1 t4 = new T1("arbaz 4");
        // T1 t5 = new T1("arbaa5");

        t3.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        // t5.start();

        // T2 tt = new T2();
        // t.start();
        // tt.start();
    }
}
