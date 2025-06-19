class _9_String_methods{
    public static void main(String[] args) {
        String a = new String("Hello");

        String b = "Shaikh Arbaaz";
        // System.out.println(b);

        int len = b.length();
        System.out.println(len);
        
        String lString = b.toLowerCase();
        System.out.println(lString);

        String uString = b.toUpperCase();
        System.out.println(uString);

        String nonTrim = "             arbaaz   ";
        System.out.println(nonTrim);
        String Trim = nonTrim.trim();
        System.out.println(Trim);

        System.out.println(b.substring(7));
        System.out.println(b.substring(7,13));

        String c = "arba";
        String rep = c.replace('a', 'z');
        String rep2 = c.replace("a", "dcb");
        System.out.println(rep);
        System.out.println(rep2);

        System.out.println(c.startsWith("rb"));
        System.out.println(c.endsWith("rb"));

        String name = "Shaikh Arbaaz";
        System.out.println(name.charAt(0));

        System.out.println(name.indexOf("a", 7)); //returns the index of first occurenece

        System.out.println(name.lastIndexOf("a", 5));

        System.out.println(name.equals("Shaikh Arbaaz"));

        System.out.println(name.equalsIgnoreCase("shaikh arbaaz"));


        // Escape sequence character

        System.out.println("I am \" noob \ti'\n \\programming");
    }
} 