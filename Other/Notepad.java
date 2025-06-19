class Notepad{
	
	public static int fibo(int num){
		if(num==1 || num==2){
			return num-1;
		}
		else{
			return fibo(num-1) + fibo(num-2);
		}
	}

	
	public static void main(String[] argsss){
		int res = fibo(5);
		System.out.printf("Fibonacci value is %d ", res);
	}
}