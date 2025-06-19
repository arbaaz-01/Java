public class LinearSearch {
    public static void main(String[] args) {
        int [] a = {23, 4, 1,2,3};
        int b = 1;
        for(int i=0; i<a.length; i++){
            if(a[i] == b){
                System.out.println("Present at index "+ i);
            }
        }
    }
}
