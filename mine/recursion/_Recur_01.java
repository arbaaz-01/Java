public class _Recur_01 {
    static int fact(int num){
        if(num==0 || num==1){
            return 1;
        }
        else if(num<0){
            return -1;
        }
        else{
            return num * fact(num-1);
        }
    }
    static int iter(int num){
        int fact = 1;
        if(num>=0){
            for(int i = 1; i<=num;  i++){
                fact = fact * i;
            }
        }
        else{
            System.out.println("Invalid input");
            return 0;
        }
        return fact;
    }
    
    public static void main(String[] args) {

        int res = fact(-4);
        if(res == -1){
            System.out.println("Invalid Input");
        }
        else{
            System.out.println(res);
        }

        System.out.println(iter(-5));
        

        
    }
}
