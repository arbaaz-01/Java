public class breakcont{
    public static void main(String[] args) {
        
        System.out.println("Break");
        for(int i = 10; i > 0; i--){
            if(i == 5){
                System.out.println("Breaking loop");
                break;
            }
            System.out.println(i);
        }
        System.out.println("Continue");
        for(int j = 0; j < 10; j++){
            if(j == 5){
                System.out.println("Skipping iteration "+j);
                continue;
            }
            System.out.println(j);
        }
    }
}
