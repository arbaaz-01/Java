import accessMod.AccessM_01;
// class Using extends AccessM_01{
//     AccessM_01 m = new AccessM_01();
//     public void show(){
//         System.out.println(m.aa);
//         System.out.println(m.bb);
//         System.out.println(m.cc);
//         System.out.println(m.dd);
//     }

// }
public class Exe extends AccessM_01{
    public static void main(String[] args) {
        AccessM_01 a = new AccessM_01();
        // a.helloP();
        // a.helloPro();
        // a.helloDefault();
        // a.helloPrivate();
        System.out.println(a.aa);
        // System.out.println(a.bb);
        // System.out.println(a.cc);
        // System.out.println(a.dd);

        // Using u = new Using();
        // u.show();
    }
}
