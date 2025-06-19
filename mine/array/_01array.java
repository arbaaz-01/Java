public class _01array {
    public static void main(String[] args) {
        
        // 1. Declaration and memory allocation
        // int [] marks = new int[5];

        // 2. Declaration and then memory allocation
        int [] marks;
        marks = new int[5];
        // Initialization
        marks[0] = 90;
        marks[1] = 75;
        marks[2] = 56;
        marks[3] = 89;
        marks[4] = 99;

        System.out.println(marks[0]);

        // 3. Declaration, memory allocation and initialization togehter
        int [] marks1 = {34, 78, 34, 32, 12};
        System.out.println(marks1[3]);
    }
}
