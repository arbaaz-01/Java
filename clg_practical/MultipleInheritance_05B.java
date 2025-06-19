class Student{
    int rollNumber;
    public void getNumber(int n){
        rollNumber = n;
    }
    public void putNumber(){
        System.out.println("Roll No: " + rollNumber);
    }
}
class Test extends Student{
    float part1, part2;
    public void getMarks(float m1, float m2){
        part1 = m1;
        part2 = m2;
    }
    public void putMarks(){
        System.out.println("Marks Obtained: ");
        System.out.println("Part 1 = " + part1);
        System.out.println("Part 2 = " + part2);
    }
}
interface Sport{
    float sportWt = 6.0F;
     void putWt();
}
class Result extends Test implements Sport{
    float total;
    public void putWt(){
        System.out.println("Sports Wt = " + sportWt);
    }
    public void display(){
        total = part1 + part2 + sportWt;
        putNumber();
        putMarks();
        putWt();
        System.out.println(
            "Total Score = "+total
        );
    }
}
class MultipleInheritance_05B{
    public static void main(String[] args) {    
        Result r = new Result();
        r.getNumber(23);
        r.getMarks(56.4f, 45.3f);
        r.display();
        r.putWt();
    }
}
