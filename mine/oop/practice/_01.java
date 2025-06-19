class Employee{
    int salary;
    String name;

    int getSalary(){
        return salary;
    }
    String getName(){
        return name;
    }
    void setName(String newName){
        name = newName;
    }

}


public class _01 {

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.name = "Arbaaz";
        emp.salary = 1000000;
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        emp.setName("Sara");
        System.out.println(emp.getName());
        
    }
    
}
