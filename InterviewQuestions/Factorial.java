public class Factorial {
    
    public static void main(String[] args) {
        
        // factRecursion
        int res1 = factRecursion(5);
        System.out.println("Factorial Using Recrsion: "+ res1);

        // factIteration
        int res2 = factIteration(0);
        System.out.println("Factorial Using Iteration: "+ res2);
    }

    public static int factIteration(int num){
        if(num<0){
            return -1;
        }
        if(num>=0){
            int fact=1;
            for(int i=1; i<=num; i++){
                fact = fact * i;  
                // 120
            }
            // while(num>0){
            //     fact = fact * num;
            //     num--;
            // }
        return fact;
        }
        return -1;
    }

    public static int factRecursion(int num){
        if(num<0){
            return -1;
        }
        if(num == 0){
            return 1;
        }
        else{
            return num * factRecursion(num-1);
        }
    }
}