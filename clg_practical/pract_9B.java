class AgeException extends Exception{
    AgeException(String s){
        super(s);
    }
}
class CheckAge{
    public void validate(int age) throws AgeException{
        if(age<18){
            throw new AgeException("You need to be 18 or above to Vote");
        }
        else{
            System.out.println("You are eligible to Vote!");
        }
    }
}
public class pract_9B {
    public static void main(String[] args) {
        CheckAge chk = new CheckAge();
        try{
        chk.validate(17);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
