class TA extends Thread{
	@Override
	public void run(){
		for(int i=0; i<=5; i++){
			System.out.println("From ThreadA: i = "+i);
		}
	System.out.println("Exit from ThreadA");
	}
}
class TB extends Thread{
	@Override
	public void run(){
		for(int i=0; i<=5; i++){
			System.out.println("From ThreadB: i = "+i);
		}
	System.out.println("Exit from ThreadB");
	}
}
class TC extends Thread{
	@Override
	public void run(){
		for(int i=0; i<=5; i++){
			System.out.println("From ThreadC: i = "+i);
		}
	System.out.println("Exit from ThreadC");
	}
}

public class pract_7B{
	public static void main(String[] args){
     new TA().start();   
     new TB().start();   
     new TC().start();   
    }
}
// TA obj1 = new TA();
// TB obj2 = new TB();
// TC obj3 = new TC();

// obj1.start();
// obj2.start();
// obj3.start();
