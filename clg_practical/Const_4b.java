//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.*;

class Employee{
    int id;
    String name;
    int salary;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Employee(){
        try{
        System.out.println("Enter Employee ID: ");
        id = Integer.parseInt(br.readLine());
        System.out.println("Enter Employee Name: ");
        name = br.readLine();
        System.out.println("Entry salary: ");
        salary = Integer.parseInt(br.readLine());
        }catch(Exception e){
            System.out.println(e);
        }
    }
    void display(){
        System.out.println("ID: "+ id);
        System.out.println("Employee name: "+ name);
        System.out.println("Employee salary: "+salary);
    }

}
class Const_4b{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.display();
    }
}