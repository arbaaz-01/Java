public class MyThread implements Runnable{

    Counter counter;

    public MyThread(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run(){
        for(int i=0; i<1000; i++){
            counter.increment();
        }
    }
    
}
