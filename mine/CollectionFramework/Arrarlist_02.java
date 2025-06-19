import java.util.ArrayList;

public class Arrarlist_02 {
    public static void main(String[] args) {


        // Arraylist is a modified and improved version of Array
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(7);
        l2.add(5);
        l2.add(1);
        l2.add(3);
        l2.add(4);

        l1.add(91);
        l1.add(23);
        l1.add(10);
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


        ArrayList<Integer> l3 = new ArrayList<>(10);
        l3.add(12);
        System.out.println(l3.isEmpty());
        System.out.println(l3.size());
        // l3.toArray();
        // System.out.println(l3.length);
        System.out.println(l1);
        // System.out.println(l3.());
        l1.remove(2);
        System.out.println(l1);


    }
}
