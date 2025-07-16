import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", "X5", 1999));
        list.add(new Car("Honda", "Accord", 2006));
        list.add(new Car("Ford", "Mustang", 1970));

        System.out.println(list);
        
        // Collections.sort(list, (a,b)-> a.year-b.year);
        // System.out.println(list);
        
        // Collections.sort(list, (a,b)-> b.year-a.year);
        // System.out.println(list);
        
        // Collections.sort(list, new Comparator<Car>() {
        //     @Override
        //     public int compare(Car c1, Car c2){
        //         return c1.year-c2.year;
        //     }
        // });

        Comparator<Car> comp = new SortCar();

        Collections.sort(list, comp);
        System.out.println(list);

        // ArrayList<Integer> lst = Arrays.asList(1,2,3);   // error
        List<Integer> lst = Arrays.asList(1,2,3);  



    }
}


class SortCar implements Comparator<Car>{
    @Override
    public int compare(Car c1, Car c2){
        return c1.year-c2.year;
    }
}

class Car{
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }

    @Override
    public String toString(){
        return "(Brand: "+brand+", Model: "+model+ ", Year: "+year+") ";
    }
    
}
