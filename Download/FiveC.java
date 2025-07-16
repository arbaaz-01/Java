class HierarchicalA
{
void display()
{
System.out.println("Hierarchical inheritance");
}
}
class HierarchicalB extends HierarchicalA
{
void sqr(int a)
{
System.out.println(a * a);
}
}
class HierarchicalC extends HierarchicalA
{
void cube(int b)
{
System.out.println(b * b * b);
}
}
public class FiveC
{
public static void main(String[] args)
{
HierarchicalB t = new HierarchicalB();
HierarchicalC s = new HierarchicalC();
t.display();
t.sqr(7);
s.cube(16);
}
}