// package accessM_getters_setters;

class Myemp{
    private int age;
    private String name;

    public void setName(String n){
        this.name = n;
    }
    public void setAge(int i){
        if(i>18){
        this.age = i;
        }
        else{
            System.out.println("Not eligible");
        }
    }

    // public void display(){
    //     System.out.println("Name: "+name+ "\nId: "+age);
    // }

    public int getId(){
        return age;
    }
    public String getName(){
        return name;
    }

    private double radius;
    private double area;
    private double perimeter;

    public void setRadius(double r){
        radius = r;
        //  static double aa = 3.142 * radius * radius;
    }
    public void setArea(double a){
        if(a == 3.14 * radius * radius){
            area = a;
            System.out.println("Right Answer");
        }
        else{
            System.out.println("Wrong answer for area");
        }
    }
    public void setPerimeter(double p){
        if(p == 2 * 3.14 * radius){
            perimeter = p;
            System.out.println("Right Answer");
        }
        else{
            System.out.println("Wrong answer for perimeter");
        }
    }

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return area;
    }
    public double getPerimeter(){
        return perimeter;
    }
   
    
}


public class _AccessM_01 {
    public static void main(String[] args) {

        Myemp e = new Myemp();
        // e.age =103;
        // e.name = "arbaz";
        e.setName("arbaaz");
        e.setAge(19);
        // e.display();

        // System.out.println(e.getId());
        int a = e.getId();
        System.out.println(a);
        System.out.println(e.getName());

        e.setRadius(2);
        e.setArea(12.56);
        e.setPerimeter(12.56);

        System.out.println(e.getRadius());
        System.out.println(e.getArea());
        System.out.println(e.getPerimeter());
        
    }
}
