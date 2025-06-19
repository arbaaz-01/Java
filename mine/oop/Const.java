class Constructor{
    String n;
    int sal;
    Constructor(String x, int y){
        n = x;
        sal = y;
    }
    Constructor(String x){
        n = x;
    }
     Constructor(){
         n = "Ali";
         sal = 2000000;
     }

    
    void show(){
        System.out.println("Name: "+ n + " Salary: "+ sal);
    }
}



public class Const{
    public static void main(String[] args) {

        Constructor c = new Constructor("hello");
        // Constructor c = new Constructor("Shaikh", 300000);
        // c.n= "Arbaaz";
        c.sal=100000;
        c.show();
        
    }
}

