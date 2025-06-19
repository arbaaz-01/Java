import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    
    public static void main(String[] args) {
        System.out.println();
        
        // Consumer
        
        Consumer<String> consumer1 = n -> System.out.println(n);
        // consumer1.accept("Arbaz");

        Consumer<Student> consumer2 = n->{
            n.setName("Ali");
            System.out.println(n.name);
        };
        
        // consumer2.accept(new Student());
        
        // Predicate 

        Predicate<Integer> pred1 = n->n%2==0;
        // System.out.println(pred1.test(10));

        Predicate<Student> pred2 = n->{
            return n.name.length()%2==0;
        };

        // System.out.println(pred2.test(new Student("Arbaz")) );
       
        // Function

        Function<Integer, String> func1 = n -> {
            if(n%2==0) return "Even";
            return "Odd";
        };

        // System.out.println(func1.apply(1));

        Function<Student, String> func2 = student -> {
            if (student.name.length() % 2 == 0) return "Even length name";
            return "Odd length name";
        };

        // System.out.println(func2.apply(new Student("Arbaz")));

        
        // Supplier
        Supplier<Student> sup1 = () -> new Student("ABC");
        Student s = sup1.get();
        // System.out.println(s.name);


        // BiConsumer
        BiConsumer<Integer, Integer> bicon1 = (n1, n2)-> System.out.println(n1*n2);
        bicon1.accept(2, 5);

        // BiPredicate
        BiPredicate<Integer, Integer> bipred = (n1, n2) -> n1*n2%2==0;
        System.out.println(bipred.test(1, 5));

        // BiFunction
        BiFunction<Integer, Integer, String> bifunc = (a, b) -> {
            if(a*b%2==0) return "Even";
            return "Odd";
        };

        System.out.println(bifunc.apply(2, 4));


        System.out.println();
    }
}
