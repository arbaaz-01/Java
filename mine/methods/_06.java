public class _06 {
    public static float avg(int...arr){
        float avg =0;
        for(int e:arr){
            avg+=e;
        }
        avg = avg/arr.length;
        return(avg);
    }

    public static void main(String[] args) {
        System.out.println(avg(2, 4, 9, 7, 4, 2, 3, 6, 9));
    }
}
