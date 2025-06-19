import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        System.out.println("Loops");
        Scanner sc = new Scanner(System.in);
        // While loop
        System.out.println("While loop");
        int i = 0;
        while (i < 10) {
            System.out.println(i + 1);
            i += 1;
        }

        // do-while loop
        System.out.println("Do while loop");
        int j = 10;
        do {
            System.out.println(j);
            j++;
        } while (j < 1); // runs atleast once even condition is false

        // for loop
        System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        int num = 2;
        System.out.println("For loop");
        for (int k = 1; k < 11; ++k) {
            System.out.println(num * k);
        }
        int x = 1;
        System.out.println(x++);
        System.out.println(x);
        
        int nat = 100;
        while (nat < 201) {
            System.out.println(nat);
            // System.out.println("I love you");
            nat += 1;
        }

        for (int l = 0; l < 5; l++) {
            System.out.println(l);
        }

        int p = 1;
        do{
            System.out.println(p);
            p++;
        }while(p<5);

        for(int m = 1; m<=30; m++){
            if(m%2 != 0){
                System.out.println(m);
            }
        }
System.out.println("Different");
        for(int t= 0; t<10; t++){
            if(t==13){
                break;
            }
            else{
                System.out.println(2*t+1);
            }
        }

        int v = 10;
        while(v > 0){
            System.out.println(v);
            v --;
        }
        
        // for(int y = 20; y>0; y-- ){
        for(int y = 8; y!=0; y-- ){
            System.out.println(y);
        }

    }
}
