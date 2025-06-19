public class _05 {
    public static int fiboRecur(int num){
        if(num == 1 || num == 2){
            return num - 1;
        }
        else if(num <= 0){
            System.out.println("Invalid input");
            return -1;
        }
        else{
            return fiboRecur(num-1) + fiboRecur(num-2);
        }
    }   
    
    public static void main(String[] args) {

        int res = fiboRecur(6);
        System.out.println(res);
        
    }
}
