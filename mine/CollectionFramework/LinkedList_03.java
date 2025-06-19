import java.util.*;
public class LinkedList_03 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(5);
        l2.add(1);
        l2.add(3);
        l2.add(4);

        l1.add(91);
        l1.add(23);
        l1.add(10);

        l1.addLast(2345);

        l1.add(0, 12);
        l1.add(0,10);
        l1.addAll(l2);

        // l1.clear();

        l1.set(2, 100);

        // for(int ele:l1){
        //     System.out.print(ele + " ");
        // }

        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();

        System.out.println(l1.contains(911));
        System.out.println(l1.indexOf(10));
        System.out.println(l1.lastIndexOf(10));


        LinkedList<Integer> l3 = new LinkedList<>();
        l3.add(12);
        System.out.println(l3.isEmpty());
        System.out.println(l3.size());
        // l3.toLinked();
        // System.out.println(l3.length);
        System.out.println(l1);
        // System.out.println(l3.());
        l1.remove(2);
        l1.offerFirst(1009);
        System.out.println(l1);

    }
}
