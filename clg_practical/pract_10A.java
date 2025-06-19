import java.io.*;
import java.util.Scanner;

class EmployeeBuffer{
    String name;
    int id;
    int salary;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    EmployeeBuffer(){
        System.out.println("---Using BufferReaderClass---");
        try{
            System.out.print("Enter the id: ");
            id = Integer.parseInt(br.readLine());
            System.out.print("Enter the name: ");
            name = br.readLine();
            System.out.print("Enter the salary: ");
            salary = Integer.parseInt(br.readLine());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void show(){
        System.out.println("******************");
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
class EmployeeScanner{
    Scanner sc = new Scanner(System.in);
    private int id, salary;
    private String name;
    EmployeeScanner(){
        System.out.println("---Using Scanner Class---");
        System.out.print("Enter Id: ");
        id = sc.nextInt();
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.println("Enter Salary: ");
        salary = sc.nextInt();
    }
    public void display(){
        System.out.println("******************");
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
public class pract_10A {
    public static void main(String[] args) {
        new EmployeeBuffer().show();
        new EmployeeScanner().display();;
    }
}
