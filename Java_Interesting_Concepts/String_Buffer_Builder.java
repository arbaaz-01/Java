public class String_Buffer_Builder {
    public static void main(String[] args) {
        long startTime, endTime;

        // String Performance Test
        startTime = System.nanoTime();
        String str = "Java";
        for (int i = 0; i < 10000; i++) {
            str += "Test";
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by String: " + (endTime - startTime));

        // StringBuffer Performance Test
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer("Java");
        for (int i = 0; i < 10000; i++) {
            sbf.append("Test");
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime));

        // StringBuilder Performance Test
        startTime = System.nanoTime();
        StringBuilder sbd = new StringBuilder("Java");
        for (int i = 0; i < 10000; i++) {
            sbd.append("Test");
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime));
    }
}
