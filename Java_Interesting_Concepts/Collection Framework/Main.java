import java.util.*;

public class Main{


    public static void main(String[] args) {
        
        SortedSet<Integer> s = new TreeSet<>();


        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new PriorityQueue<>();

        Set<Integer> set = new LinkedHashSet<>();


        List<Integer> lst = new ArrayList<>(Arrays.asList(5, 0, -1, 45, 3, 0));

        System.out.println(lst);
        // lst.sort((a,b)->a-b);
        // lst.sort(();

        // Collections
        // System.out.println(lst);

        linked_set();



    }


    public static void linked_set(){

        Set<Integer> linkedSet = new LinkedHashSet<>();
        Set<Integer> set = new HashSet<>();

        linkedSet.add(10);
        linkedSet.add(5);
        linkedSet.add(19);

        set.add(10);
        set.add(5);
        set.add(19);

        System.out.println(linkedSet);
        System.out.println(set);

        
    }
}



interface Int{

    abstract public void meth1();

    int meth2();
}