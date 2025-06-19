public class Finally_06 {
    public static int div() {
        try {
            int a = 10;
            int b = 2;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Cleaning up resources... End of the program");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = div();
        System.out.println(k);

        for (int i = 5; i >= 0; i--) {
            try {
                
                System.out.println(10/i); 
                
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("Finally is executing...");
            }

        }

        try{
            System.out.println(15/2f);
        }
        finally{
            System.out.println("finally..");
        }
    }
}
