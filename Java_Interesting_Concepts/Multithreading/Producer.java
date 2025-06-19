public class Producer extends Thread{
    Company c;
    Producer(Company c){
        this.c=c;
    }
    @Override
    public void run(){

        int i=1;
        while(true){
            c.produce_item(i);
            try{Thread.sleep(800); }catch(InterruptedException e){}
            i++;
        }
    }
}
