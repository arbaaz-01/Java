public class StarPatterns {
    public static void main(String[] args) {
        // Pattern 1
        int n = 2;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
