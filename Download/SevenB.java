class TA extends Thread { 
public void run() {
for (int i=1;i<=5;i++) 
{ 
System.out.println("\tFrom ThreadA : i = "+i);
}
System.out.println("Exit from A");
}
}
class TB extends Thread { 
public void run() {
for (int i=1;i<=5;i++) 
{ 
System.out.println("\tFrom ThreadB : i = "+i);
}
System.out.println("Exit from B");
}
}
class TC extends Thread { 
public void run() 
{
for (int i=1;i<=5;i++) {
System.out.println("\tFrom ThreadC : i = "+i); }
System.out.println("Exit from C");
}
}
public class SevenB {
public static void main(String[] args) 
{ 
new TA().start();
new TB().start();
new TC().start();
}
}
