class Counter {
    private static int count = 0; // Static field

    public Counter() {
        count++; // Increment count for every instance created
    }

    public static int getCount() { // Static method
        return count;
    }
}

public class StaticConcept{

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.getCount());
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        System.out.println(c4.getCount());

    }
}


