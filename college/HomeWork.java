public class HomeWork {
    public static void main(String[] args) {
        int[] rollNo = { 1, 2, 3, 4, 5, 6 };
        int[] marks = { 65, 89, 98, 34, 59, 45 };

        for (int i = 0; i < marks.length; i++) {
            int c = 0;
            if (marks[i] >= 80 && marks[i] <= 100) {
                c = 1;
            } else if (marks[i] >= 60 && marks[i] <= 79) {
                c = 2;
            } else if (marks[i] >= 50 && marks[i] <= 59) {
                c = 3;
            } else if (marks[i] >= 40 && marks[i] <= 49) {
                c = 4;
            } else if (marks[i] >= 0 && marks[i] <= 39) {
                c = 5;
            }
            switch (c) {
                case 1:
                    System.out.println("RollNo: " + rollNo[i] + " --Honours--");
                    break;
                case 2:
                    System.out.println("RollNo: " + rollNo[i] + " --First Division--");
                    break;
                case 3:
                    System.out.println("RollNo: " + rollNo[i] + " --Second Division--");
                    break;
                case 4:
                    System.out.println("RollNo: " + rollNo[i] + " --Third Division--");
                    break;
                case 5:
                    System.out.println("RollNo: " + rollNo[i] + " Fail :( ");
                    break;
                default:
                    System.out.println("Something went wrong");
            }
        }
    }
}
