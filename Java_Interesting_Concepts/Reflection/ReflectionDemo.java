import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        
        Class<?> clazz = Class.forName("Person");

        System.out.println("Class Name: " + clazz.getName());

        System.out.println("\nFields");
        for(Field f:clazz.getDeclaredFields()){
            System.out.println("- " + f.getName());
        }

        System.out.println("\nMethods");
        for(Method m:clazz.getDeclaredMethods()){
            System.out.println("- " + m.getName());
        }

        System.out.println("\nConstructors");
        for(Constructor<?> c:clazz.getDeclaredConstructors()){
            System.out.println("- " + c);
        }

        Person p = new Person();
        Field field = p.getClass().getDeclaredField("name");

        field.setAccessible(true);

        String nameValue = (String) field.get(p);
        System.out.println("Private field value: "+nameValue);

    }
}
