public class methods {
    static int logic(int x, int y){
        
        return x * y;
    }
    float sum(float a, float b){
        float c = a +b;
        return c;
    }
    static void greet(String name){
        System.out.println("Hello "+name);
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 7;
        System.out.println(logic(a,b));

        greet("arbaaz");

        float x = 23.23f; float y = 43.234f;
        float z;
        methods obj = new methods(); 
        z = obj.sum(x, y);
        System.out.println(z);

      
    }
}
