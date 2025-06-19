public class PrimeStandardCode {
    public static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i=2; i<=num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        // int num = 97;
        // if(isPrime(num)){
        //     System.out.println("Prime Number");
        // }
        // else{
        //     System.out.println("Not a prime Number");
        // }

        long startTime = System.nanoTime();
        for(int i=2; i<=10; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }

        }
        System.out.println();
        long stopTime = System.nanoTime();
        long exeTime = stopTime - startTime;
        System.out.println("Execution Time: "+exeTime/1e+9);
    }
}
