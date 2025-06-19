public class _05 {
    public static void main(String[] args) {
        int [] arr = {2, 4, 1, 3};
        int [] rev = new int[arr.length];
        int last = arr.length -1;
        for(int i=last; i>=0; i--){
            rev[last-i] = arr[i];
        }

        for(int j =0 ; j<rev.length; j++){
            System.out.print(rev[j] + " ");
        }
    }
}
