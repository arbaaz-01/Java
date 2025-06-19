import java.util.*;
public class Chap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1

        // Q2 
       /* int s1, s2, s3;
        System.out.print("Enter Marks of Subject 1 out of 100: ");
        s1 = sc.nextInt();
        System.out.print("Enter Marks of Subject 2 out of 100: ");
        s2 = sc.nextInt();
        System.out.print("Enter Marks of Subject 3 out of 100: ");
        s3 = sc.nextInt();

        if(s1 > 33 && s2 > 33 && s3 > 33){
            if(((s1+s2+s3)/300.0f) > 40){
                System.out.println("Pass");
            }
        }
        else{
            System.out.println("Fail");
        }*/


        // Q3
        System.out.print("Enter Salary: ");
        float sal = sc.nextFloat();
        float tax = 0;
        if(sal < 2.5){
            tax += 0;
        }
        else if(sal>=2.5 && sal <= 5){
            tax = tax + 0.05f * (sal - 2.5f);
        }
        else if(sal>=5 && sal <= 10){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (sal - 5f);
        }
        else{
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (sal - 10.0f);
        }

        System.out.println("Tax Amount: "+ tax);


            //    System.out.println("Enter your income in Lakhs per annum");
            //    float tax = 0;
            //    float income = sc.nextFloat();
            //    if(income<=2.5){
            //        tax = tax + 0;
            //    }
            //    else if(income>2.5f && income <= 5f){
            //        tax = tax + 0.05f * (income - 2.5f);
            //    }
            //    else if(income>5f && income <= 10.0f){
            //        tax = tax + 0.05f * (5.0f - 2.5f);
            //        tax = tax + 0.2f * (income - 5f);
            //    }
            //    else if(income>10.0f){
            //        tax = tax + 0.05f * (5.0f - 2.5f);
            //        tax = tax + 0.2f * (10.0f - 5f);
            //        tax = tax + 0.3f * (income - 10.0f);
            //    }
            //    System.out.println("The total tax paid by the employee is: " + tax);
    }
    
}
