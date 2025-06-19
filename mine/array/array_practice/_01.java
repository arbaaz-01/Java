public class _01 {
    
    public static void main(String[] args) {
        
        float [] arr = {23.1f, 12.41f, 1.23f, 45.5f, 34.23f};

        float sum=0;
        for(float element: arr){
            sum = sum + element;
        }

        System.out.println(sum);
    }
}
