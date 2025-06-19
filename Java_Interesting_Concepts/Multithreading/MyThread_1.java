public class MyThread_1 implements Runnable{

    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("The value of i: "+i);

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        
        Thread th1 = new Thread(new MyThread_1());

        th1.start();

        MyThread_2 th2 = new MyThread_2();
        th2.start(); 

        System.out.println("End");

        for(int i=876; i<886; i++){
            System.out.println(i);
        }
    }

}
