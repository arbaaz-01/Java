import java.util.*;
import java.lang.reflect.*;

public class ArrayListCapacityCheck {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>(); // default constructor
        list.add(10);
        // Use reflection to access the private elementData field
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);

        Object[] elementData = (Object[]) field.get(list);
        System.out.println("ArrayList default capacity: " + elementData.length); 
    }
}
