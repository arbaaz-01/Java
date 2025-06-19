import java.util.Vector;

public class vector_01 {
    public static void main(String[] args) {
        
        Vector lst = new Vector(5);
        lst.addElement("23");
        lst.addElement("11");
        lst.addElement("A");
        lst.addElement("Ali");
        System.out.println(lst.size());
        System.out.println(lst.elementAt(3));

        String[] str = new String[lst.size()];
        lst.copyInto(str);
        for(String e:str){
            System.out.println(e);
        }
        
    }
}
