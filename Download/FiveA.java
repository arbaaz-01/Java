class SIParent 
{
float length;
float breadth;
void getSingleInheritanceParent(float x, float y) 
{
length = x;
breadth = y;
}
float rectangleArea() 
{
return length * breadth;
}
}
class SIChild extends SIParent 
{
float height;
void getSingleInheritanceChild(float z) 
{
height = z;
}
float cuboidVolume() 
{
return length * breadth * height;
}
}
public class FiveA 
{
public static void main(String[] args) 
{
SIChild child = new SIChild();
System.out.println("Single Inheritance");
child.getSingleInheritanceParent(14, 12);
System.out.println("Area: " + child.rectangleArea());
child.getSingleInheritanceChild(10);
System.out.println("Volume: " + child.cuboidVolume());
}
}
}