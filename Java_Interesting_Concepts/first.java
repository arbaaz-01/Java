public class first{
    public static void main(String[] args){
        String str = "MaaG";
        String str1 = "";
        String str2 = "";

        int mid = str.length()/2;

        for(int i=0; i<str.length(); i++){
            if(i<mid){
                str1 += Character.toUpperCase(str.charAt(i));
            }
            else{
                str2 += Character.toLowerCase(str.charAt(i));
            }
        }
        System.out.println(str1 + str2);
    }
}