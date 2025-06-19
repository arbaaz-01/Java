import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student> {
    
    int rollno;
    String name;

    public Student(int rollno, String name){
        this.rollno = rollno;
        this.name=name;
    }

    // increasing order
    @Override
    public int compareTo(Student other){
        return this.rollno-other.rollno;
    }

    // Decreasing order
    // @Override
    // public int compareTo(Student other){
    //     return other.rollno-this.rollno;
    // }
}

public class Main{

    public static void main(String[] args) {
        Student[] arr = new Student[5];

        arr[0] = new Student(10, "Arbaz");
        arr[1] = new Student(1, "Ali");
        arr[2] = new Student(5, "Adam");
        arr[3] = new Student(9, "King");
        arr[4] = new Student(102, "Ching");

        
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].rollno + " " +arr[i].name);
        }

        System.out.println();
        
        // Arrays.sort(arr);

        // Arrays.sort(arr, (a,b)->b.rollno-a.rollno);

        // Sorting based on name increasing order
        // Arrays.sort(arr, Comparator.comparing(a->a.name));
        
        // Based on name decreasing order
        Arrays.sort(arr, (a,b)->b.name.compareTo(a.name));  

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].rollno + " " +arr[i].name);
        }

    }
}


