import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        
        List<Integer> lst = new ArrayList<>(Arrays.asList(2, 5, 7, 1, 10, 4, 4));

        Stream<Integer> st = lst.stream();
        // System.out.println(st.count());

        // lst.stream().
        // filter(a->a%2==0).
        // distinct().
        // sorted().
        // forEach(a->System.out.print(a+" "));
        
        // lst.stream().
        // filter(a->a%2==0).
        // distinct().
        // sorted().
        // map(a->a*2).
        // forEach(a->System.out.print(a+" "));


        int sum = lst.stream().
        filter(a->a%2==0).
        distinct().
        sorted().
        map(a->a*2).
        reduce(0, (a,b)->a+b);

        // System.out.println(sum);


        List<Integer> resList = lst.stream().
                                filter(a->a%2==1).
                                distinct().
                                map(a-> a<5?a:a*2).
                                sorted((a,b)->Integer.compare(b,a)).
                                collect(Collectors.toList());

        // System.out.println(resList);




        // Using Employee Object

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"aman", 70000,"sde1","aman1@gmail.com","aman2@gmail.com"));
        empList.add(new Employee(2,"amit", 80000,"lead","amit1@gmail.com","amit2@gmail.com"));
        empList.add(new Employee(3,"varun", 90000,"sde1","varun11@gmail.com","varun91@gmail.com"));
        empList.add(new Employee(4,"rahul", 70000,"sde2","rahul@gmail.com","rahul12@gmail.com"));
        empList.add(new Employee(5,"aman", 70000,"sde1","aman15@gmail.com","aman25@gmail.com"));


        Stream<Employee> st1 = empList.stream();
        // System.out.println(st1.count());

        // empList.stream().
        // filter(a->a.designation.equals("sde1")).
        // distinct().
        // sorted((a,b)->Integer.compare(b.salary,a.salary)).
        // forEach(a->System.out.println(a));


        // empList.stream().
        // filter(a->a.designation.equals("sde1")).
        // distinct().
        // sorted((a,b)->a.salary-b.salary).
        // map(a->{
        //     a.salary*=2;
        //     return a;
        // }).
        // forEach(a->System.out.println(a));


        // List<Employee> resList1 = empList.stream().
        // filter(a->a.designation.equals("sde1")).
        // distinct().
        // sorted((a,b)->a.salary-b.salary).
        // map(a->{
        //     a.salary*=2;
        //     return a;
        // }).
        // collect(Collectors.toList());

        // System.out.println(resList1);

        Employee emp = empList.stream().
        filter(a->a.designation.equals("sde1")).
        distinct().
        map(a->{
            a.salary*=2;
            return a;
        }).
        reduce(new Employee(0), (a,b)->new Employee(a.salary+b.salary));
        // forEach(a->System.out.println(a));

        // System.out.println(emp);

        // map and flatMap
        List<ArrayList<String>> empMails1= empList.stream().
        filter(a->a.designation.equals("sde1")).
        distinct().
        map(a -> a.emails). 
        collect(Collectors.toList());

        List<String> empMails2= empList.stream().
        filter(a->a.designation.equals("sde1")).
        distinct().
        flatMap(a->a.emails.stream()).
        collect(Collectors.toList());


        System.out.println(empMails2);
    }
}
