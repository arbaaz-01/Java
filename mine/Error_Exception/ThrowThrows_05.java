class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius can't be negative";
    }
    @Override
    public String getMessage(){
        return "Radius can't be negative";
    }
}

public class ThrowThrows_05 {

    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        System.out.println(result);
        return result;
    }

    public static int div(int x, int y) throws ArithmeticException{
        if(y==0){
            throw new ArithmeticException();
        }
        int res = x/y;
        return res;
    }
    public static void main(String[] args) {
        // try{
            // int a = div(4, 0);
            // System.out.println(a);
            div(3, 9);
        // }
        // catch(Exception e){
        //     System.out.println("Exception");
        // }
        // try{
        // area(-4);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
    }
     

    
}

