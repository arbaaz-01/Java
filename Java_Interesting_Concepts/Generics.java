public class Generics {

    // Generic method

    public static <E> void greed(E name){
        System.out.println("Hello "+name);
    }

    // error
    // public static <E1, E2> double add(E1 num1, E2 num2){
    //     double res;
    //     res = num1+num2;
    //     return res;
    // }

    // solution
    public static <E1 extends Number, E2 extends Number> double add(E1 num1, E2 num2){
        double res = num1.doubleValue() + num2.doubleValue();
        return res;
    }
    public static void main(String[] args) {

        Box<String> obj1 = new Box<>();
        obj1.setItem("Arbaaz");
        obj1.getItem();
        System.out.println(obj1.item.getClass().getName());
        
        Box<Integer> obj2 = new Box<>();
        obj2.setItem(10);
        obj2.getItem();
        System.out.println(obj2.item.getClass().getName());

        

    }
}


// Generic clss, can also take multiple params  
// class MyGen<T1, T2, T3>{
//      Implementation
// }

class Box<T>{
    public T item;

    public void setItem(T item){
        this.item=item;
    }

    public void getItem(){
        System.out.println(this.item);
    }
}
