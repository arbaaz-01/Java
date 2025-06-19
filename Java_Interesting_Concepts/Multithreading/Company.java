class Company {
    int n;

    boolean flag = true;
    synchronized public void produce_item(int n){
        if(!flag){
            try{wait();}catch(Exception e){}
        }
        this.n=n;
        flag=false;
        notify();
        System.out.println("Produced: "+this.n);
    }

    synchronized public int consume_item() {
        if(flag){
            try{wait();}catch(Exception e){}
        }
        System.out.println("Consumed: "+this.n);
        this.flag=true;
        notify();
        return this.n;
    }
}
