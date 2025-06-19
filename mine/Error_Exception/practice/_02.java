public class _02{

    public static void main(String[] args){
        try{
            System.out.println(9/0);
        }
        catch(ArithmeticException e){
            System.out.println("HaHa");
        }
        catch(IllegalArgumentException e){
            System.out.println("HeHe");
        }
    }
}
