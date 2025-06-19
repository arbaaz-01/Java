public class MethodOverloading {
    // static int add(int x, int y){
    //     return x + y;
    // }
    // int sub(int x, int y){
    //     return x - y;
    // }
    // int sub(){
    //     return 0;
    // }

    static int fact(int num){
    if(num >= 1){
     return num * fact(num-1);
    }
    else{
        return 1;
    }   
    }

    static void msg(){
        System.out.println("---Affliction---");
    }

    static void change(int z){
        // System.out.println(z);
        z = 1000;
        // System.out.println(z);
    }
    static void chArray(int [] arr){
        arr[0] = 70;
        arr[4] = 90;
    }

    static void greet(){
        System.out.println("Hello ");
    }

    static void greet(String name){
        System.out.println("Hello "+name);
    }

    static void greet(String name, int marks){
        System.out.println("Hello "+ name);
        System.out.println("You got marks: "+ marks);
    }
    public static void main(String[] args) {
        
        // System.out.println(add(3,9));
        // MethodOverloading m = new MethodOverloading();
        // System.out.println(m.sub(3,9));
        // System.out.println(m.sub());

        System.out.println("Factorial: "+ fact(-5));

        // msg();

        
        int z = 34;
        change(z);
        // System.out.println(z);
        
        // int [] m = {23, 45, 67, 34, 21};
        // chArray(m);
        // for(int element: m){
        //     System.out.print(element+" ");
        // }


            greet();
            greet("Arbaaz");
            greet("Arbaaz", 90);

    }
}
