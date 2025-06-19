
public class StringCompare {
    public static void main(String[] args) {
        
        String str = "arbaaz";
        String str2 = "arbaaz";

        String str3 = new String("ali");     //cannot used == operator 
        String str4 = new String("ali");


        if(str3.equals(str4)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }

        System.out.println(str.equals(str2));
    }    
}
