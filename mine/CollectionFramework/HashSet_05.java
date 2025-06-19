import java.util.HashSet;

public class HashSet_05 {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>(10, 0.5f);

        h1.add(2);
        h1.add(3);
        h1.add(5);
        h1.add(2);
        System.out.println(h1);

    }
}
