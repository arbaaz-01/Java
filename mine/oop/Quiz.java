class Employee{
    int sal;
    Employee(){
        sal = 10000;
    }
    Employee(int s){
        sal = s;
    }
    void show(){
        System.out.println("Salary: "+ sal);
    }
}


public class Quiz {
    public static void main(String[] args) {
        Employee e = new Employee(2000);
        e.show();
    }
}
