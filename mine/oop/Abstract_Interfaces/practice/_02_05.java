interface BasicAnimal{
    public void eat();
    public void sleep();
}
class Monkey{
   
    public void jump(){
        System.out.println("Jumping...");
    }
    public void bite(){
        System.out.println("Biting...");
    }
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
    public void brain(){
        System.out.println("Thinking...");
    }
}

public class _02_05 {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.sleep();
        h.brain();
        h.jump();
        h.bite();

        Monkey m = new Human();
        m.bite();
        m.jump();
        // m.brain();
        BasicAnimal a = new Human();
        a.eat();
        a.sleep();
        // a.brain();
    
    }
}
