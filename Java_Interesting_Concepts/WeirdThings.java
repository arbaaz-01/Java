import java.util.*;

public class WeirdThings {
    
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(method2()));


        int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

        System.out.println(Arrays.deepToString(arr));
    }

    public static int [] method1(){
        return new int[] {1,2};
    }

    public static int method2() [] {
        return new int[] {1,2};
    }
}
