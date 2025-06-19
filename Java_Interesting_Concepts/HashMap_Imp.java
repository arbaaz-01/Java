import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class HashMap_Imp {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(3,11);
        map.put(2,10);

        // ConcurrentModificationExceptio
        for(Integer key:map.keySet()){
            if(key==2) map.remove(key);
        }
        
        // ConcurrentModificationExceptio
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getKey()==2) map.remove(2);
        }

        // allowed
        System.out.println(map);
        Iterator itr = map.keySet().iterator();
        while(itr.hasNext()){
            Integer current = (Integer)itr.next();
            if(current==2){
                itr.remove();
            }
        }
        System.out.println(map);

        // Use the entrySet() iterator to iterate over key-value pairs
        Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, Integer> current = itr.next();
            if (current.getKey() == 2) {
               itr.remove(); // Safely remove the entry
            }
        }
        System.out.println(map);
    }
}
