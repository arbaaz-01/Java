public class Student {
    int rollno;
    String name;

    Student(){

    }
    Student(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }

    @Deprecated
    public void getMarks(){
        System.out.println(80);
    }
}
