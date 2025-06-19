/*
class One{
    public void name(){
        System.out.println("Language is Java");
    }

    public void greet(){
        System.out.println("Hello");
    }

    public void welcome(){
        System.out.println("Welcome");
    } 
}

class Two extends One{
    public void name(){
        System.out.println("Language is Java from Two class");
    }
    public void print(){
        System.out.println("checking ...");
    }
}
public class _DynamicMethodDispatch {
    public static void main(String[] args){

        // One o = new One();
        // o.name();
        // Two t = new Two();

        One obj = new Two();

        obj.greet();
        obj.name();
        // obj.print();
    }
}
*/

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class _DynamicMethodDispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone(); // Allowed
        // SmartPhone smobj = new SmartPhone(); // Allowed
        // obj.name();

        Phone obj = new SmartPhone(); // Yes it is allowed
        // SmartPhone obj2 = new Phone(); // Not allowed

        obj.showTime();
        obj.on();
        // obj.music(); Not Allowed


    }
}

