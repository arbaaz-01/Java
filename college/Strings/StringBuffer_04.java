public class StringBuffer_04 {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("Hello");
        StringBuffer str2 = new StringBuffer("World");

        // System.out.println(str.append(str2));

        str.setCharAt(4, 'O');
        System.out.println(str);

        System.out.println(str.insert(0, 'h'));

        System.out.println(str.length());
        
        str.setLength(10);
        System.out.println(str.length());
        
        System.out.println(str);

    }
}
