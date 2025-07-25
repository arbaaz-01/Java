import java.util.LinkedHashMap;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    
    int capacity;

    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity=capacity;
    }



    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        // TODO Auto-generated method stub
        return size()>capacity;
    }



    public static void main(String[] args) {
        
        LRUCache<String, Integer> cache = new LRUCache<>(3);
        cache.put("A", 45);
        cache.put("B", 19);
        cache.put("C", 87);

        cache.get("A");
        cache.put("D", 33);

        System.out.println(cache);


    }
}
