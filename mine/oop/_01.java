class Employee{
    int id;
    String name;
    int salary;

    public void getDetails(){
        System.out.println("My id is: " + id);
        System.out.println("My name is: " + name);
    }
    public int getSalary(){
        return salary;
    }
}

public class _01 {
    public static void main(String[] args) {
        System.out.println("My first Java class");

        Employee arbaz = new Employee();  //Instantiating a new Employee object

        // Setting properties
        arbaz.id = 54;          
        arbaz.name = "ali";
        arbaz.salary = 1000000;
        
        Employee ali = new Employee();
        ali.id = 55;
        ali.name = "joy";
        ali.salary = 100000;
        // Printing the attributes
        // System.out.println(arbaz.id);
        // System.out.println(arbaz.name);

        arbaz.getDetails();
        int sal = arbaz.getSalary();
        System.out.println("Salary is: "+sal);
        ali.getDetails();
        int sal2 = ali.getSalary();
        System.out.println("Salary is: "+sal2);

    }
}
