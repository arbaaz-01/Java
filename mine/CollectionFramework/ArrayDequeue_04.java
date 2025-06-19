import java.util.ArrayDeque;
public class ArrayDequeue_04 {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> d1 = new ArrayDeque<>();
        d1.add(10);
        d1.add(11);
        d1.add(13);
        d1.addFirst(18);
        System.out.println(d1);
        System.out.println(d1.getFirst());
        System.out.println(d1.getLast());
    }
}
