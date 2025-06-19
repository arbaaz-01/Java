public class Check {
    static{
        
        // System.out.println("Without compilation");
        // int a = 38;
    }

    public static void main(String[] args) {
        // System.out.println("Hello World ");

        for(int i=0; i<10; i++){
            double a = Math.random()*10;
            System.out.print(a +" -> ");
            // System.out.println();
            System.out.print(Math.round(a)+" | ");
        }

        System.out.println();
        int [][] a = {{23, 10, 99}, {10, 89, 100}};

        for(int[] ele: a){
            
            for (int e:ele) {
                System.out.println(e);
            }
        }
    }
}
