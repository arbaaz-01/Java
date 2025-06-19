import java.util.Arrays;
import java.util.Comparator;

public class ComparableComparator {
    public static void main(String[] args) {
        
        Student[] student = new Student[5];
        student[0] = new Student(10, "Raju", 22);
        student[1] = new Student(1, "Ali", 23);
        student[2] = new Student(5, "King", 22);
        student[3] = new Student(4, "Ping", 23);
        student[4] = new Student(0, "Logan", 21);

        // Arrays.sort(student, new Comparator<Student>() {
        //     @Override
        //     public int compare(Student s1, Student s2){
        //         return s1.age-s2.age;
        //     }
        // });

        // for(Student s:student){
        //     System.out.println(s);
        // }
        
        
        
        // Sorting in decreasing order of age if age is same than increasing order of rollno
        Comparator<Student> comp = new Comparator<>(){
            @Override
            public int compare(Student o1, Student o2){
                if(o2.age-o1.age==0) return o1.rollno-o2.rollno;
                return o2.age-o1.age;
            }
        };
        
        for(Student s:student){
            System.out.println(s);
        }
        System.out.println();
        Arrays.sort(student, comp);
        for(Student s:student){
            System.out.println(s);
        }
        
    }
}

class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;

    Student(){}

    Student(int rollno, String name, int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString(){
        return rollno+", "+name+", "+age;
    }

    @Override
    public int compareTo(Student other){
        return this.rollno-other.rollno;
    }
}
