class Square{
    int side;
    
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4 * side;
    }
}


public class _03 {
    public static void main(String[] args) {
        
        Square s1 = new Square();
        s1.side = 5;
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    }
}
