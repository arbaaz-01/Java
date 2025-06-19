public class _09 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1; i<=10; i++){
            sum += (8 * i);
        }
        System.out.println(sum);

        int j = 0;
        do{
            System.out.println("do while loop "+j);
            j++;
        }while(j>10);

    }
}
