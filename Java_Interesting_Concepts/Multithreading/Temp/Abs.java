public abstract class Abs {
    private String name;
    private int age;

    Abs(){
        System.out.println("Abs const");
        this.name="noname";
        this.age=Integer.MAX_VALUE;
    }

    Abs(String name, int age){
        System.out.println("Abs Parameterized Const");
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    abstract void greetHuman(String name);
    
    abstract int sum(int a, int b);
    
    abstract String random();
    
}
