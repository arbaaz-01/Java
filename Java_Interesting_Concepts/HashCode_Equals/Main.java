import java.util.HashMap;
import java.util.HashSet;

public class Main extends Object{
    public static void main(String[] args) {
        
        HashMap<Student, Integer> map = new HashMap<>();
        map.put(new Student(1, "John"), 1);
        map.put(new Student(1, "John"), 1);

        HashSet<Student> set = new HashSet<>();
        set.add(new Student(1, "John"));
        set.add(new Student(1, "John"));

        System.out.println(map);

        System.out.println(set);

    }
}
