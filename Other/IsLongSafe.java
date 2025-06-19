public class IsLongSafe {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);

        System.out.println(System.currentTimeMillis());

        System.out.println(Long.MAX_VALUE - System.currentTimeMillis());
    }
}
