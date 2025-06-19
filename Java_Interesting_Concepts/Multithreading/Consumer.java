public class Consumer extends Thread{
    Company c;
    Consumer(Company c){
        this.c=c;
    }

    @Override
    public void run(){

        while (true) {
            int a = c.consume_item();
            // System.out.println();
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
