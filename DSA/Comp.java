import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Comp {
    
    public static void main(String[] args) {

        Comparator<String> com = new Comparator<String>(){
            public int compare(String s1, String s2){

                if(s1.length() < s2.length()) return 1;
                else return -1;
            }
        };
        
        List<String> mylist = new ArrayList<>();

        mylist.add("abdc");
        mylist.add("df");
        mylist.add("k");
        mylist.add("fk");
        mylist.add("ytr");

        System.out.println(mylist);
        Collections.sort(mylist, com);
        System.out.println(mylist);

    }
}
