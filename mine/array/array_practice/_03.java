public class _03 {
    public static void main(String[] args) {
        
        int [] ph_marks = {90, 80, 40, 50, 35, 95};

        int sum = 0;
        for(int element: ph_marks){
            sum = sum + element;
        }
        int avg = sum/ph_marks.length;
        System.out.println(avg);
    }
}
