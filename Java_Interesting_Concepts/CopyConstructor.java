class Person {
    String name;
    int age;

    // Regular constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class CopyConstructor {
    
    public static void main(String[] args) {
        
        Person p1 = new Person("A", 12);
    
        Person p2 = new Person(p1);

        System.out.println(p1.name);
        System.out.println(p1.age);

        System.out.println(p2.name);
        System.out.println(p2.age);
        
        p2.name="B"; p2.age=20;
        System.out.println(p1.name);
        System.out.println(p1.age);


    }

}
