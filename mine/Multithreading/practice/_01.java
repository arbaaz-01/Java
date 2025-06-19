class A extends Thread{
    A(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 0;
        while(i>100){
            System.out.println("Good Morning! "+getState());
            i++;
        }
    }
}
class B extends Thread{
    B(String name){
        super(name);
    }
    @Override
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Welcome! "+getState());
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                System.out.println(e);
            }

            i++;
        }
    }
}

public class _01 {
    public static void main(String[] args) {
        A a = new A("arbaz");
        B b = new B("Ali");
        a.setPriority(Thread.MAX_PRIORITY);
        // a.setPriority(6);
        System.out.println(a.getPriority());
        b.setPriority(Thread.MIN_PRIORITY);
        // b.setPriority(9);
        System.out.println(b.getId());
        System.out.println(b.getName());
        System.out.println(b.getPriority());
        // a.start();
        System.out.println(a.getState());
        // a.start();
        System.out.println(a.getState());
        System.out.println(Thread.currentThread().getState());
        // b.start();
        
    }
}
