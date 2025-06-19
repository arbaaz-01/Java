import java.util.*;

public class Concrete{
    
    public static void main(String[] args) {
        
        // Anonymous class
        Calculator c = new Calculator(){
            @Override
            public int solve(int a, int b){
                return a+b;
            }
            @Override
            public int solve(int a, int b, int c){
                return a+b+c;
            }
        };

        // System.out.println(c.solve(2, 4));

        Comparator<Integer> comp = a -> -a;

        TreeMap<Integer, Integer> map = new TreeMap<>(comp);
        map.put(10, 3);
        map.put(1, 12);
        map.put(5, 56);
        map.put(2, 45);

        System.out.println(map);


    }
}
