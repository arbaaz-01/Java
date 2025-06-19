public class PassValRef {
    

    public static int doSomething(int a){
        a += 100;
        System.out.println(a);
        return a;
    }

    public static void doOnArr(int[] b){
        b[0] = 199;
        b[1] += 10;
    }

    public static void main(String[] args) {
        int a = 100;
        PassValRef.doSomething(a);
        System.out.println("After FunctionCall: "+a);


        int[] b = {100, 12};
        for(int ele:b){
            System.out.print(ele+" ");
        }
        doOnArr(b);
        for(int ele:b){
            System.out.print(ele+" ");
        }

        System.out.println(b);
    }
}
