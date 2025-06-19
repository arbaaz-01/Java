public class pract_9A {
    public static void main(String[] args) {
        String str = "Arbaaz";
        String str2;
        str2 = new String("Shaikh");
        String str3 = new String("  Ali  ");
  
        String str4 = str + str3;
        System.out.println(str4);
        // String Methods
        System.out.println("Length: " + str.length());
        System.out.println("toUpperCase: " + str.toUpperCase());
        System.out.println("tpLowerCase: " + str.toLowerCase());
        System.out.println("replace: " + str.replace('a', '@'));
        System.out.println("Without trim: " + str3);
        System.out.println("trim: " + str3.trim());
        System.out.println("equals: " + str.equals(str2));
        System.out.println("equalsIsIgnoreCase: " + str.equalsIgnoreCase(str2));
        System.out.println("charAt: " + str.charAt(0));
        System.out.println("compareTo: " + str.compareTo(str2));
        System.out.println("concat: " + str.concat(str2));
        System.out.println("substring: " + str.substring(2));
        System.out.println("substring: " + str.substring(3, 4));
        char[] a = { 'a', 'l', 'i' };
        System.out.println("String.ValueOf: " + String.copyValueOf(a));
        System.out.println("stringOf: " + str.indexOf("a"));
        System.out.println("stringOf: " + str.indexOf("a", 4));
    }
}

