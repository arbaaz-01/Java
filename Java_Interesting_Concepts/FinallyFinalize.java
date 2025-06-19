public class FinallyFinalize extends Object{

    // finalize is deprecated from Java 9
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("finalize method called");
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        FinallyFinalize obj = new FinallyFinalize();
        obj = null;
        System.gc();
        System.out.println("Main method completed");
    }
}
