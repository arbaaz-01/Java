class Teacher{
    float square(float x){
        return x * x;
    }
}
class Student1 extends Teacher{
    float cube(float y){
        return y * y * y;
    } 
}
class Student2 extends Student1{
    void display(){
        System.out.println("Multilevel Inheritance");
    }
}
public class Multilevel_5B {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.display();
        System.out.println(s.square(2));
        System.out.println(s.cube(2));
    }
}
