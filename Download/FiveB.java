//5B Implement multilevel inheritance

class Teacher {
float square(float x) {
return x * x;
}
}
class Student1 extends Teacher {
float cube(float y) {
return y * y * y;
}
}
class Student2 extends Student1 {
void display() {
System.out.println("Multi Level Inheritance");
}
}
public class FiveB {
public static void main(String[] args) {
Student2 child = new Student2();
child.display();
System.out.println("Square: " + child.square(5));
System.out.println("Cube: " + child.cube(5));
}
}