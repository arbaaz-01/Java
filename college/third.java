public class third {
    public static void main(String[] args) {
        int [] rollNo = {12, 90, 78, 34};
        int [] marks = {89, 67, 45, 39};

        for(int i =0; i<marks.length; i++){
            if(marks[i] > 80){
                System.out.println(rollNo[i] + " O grade");
            }
            else if(marks[i] > 70){
                System.out.println(rollNo[i] + " A grade");
            }
            else if(marks[i] > 60){
                System.out.println(rollNo[i] + " B grade");
            }
            else if(marks[i] > 40){
                System.out.println(rollNo[i] + " C grade");
            }
            else{
                System.out.println(rollNo[i] + " FAIL");
            }
        }
    }
}
