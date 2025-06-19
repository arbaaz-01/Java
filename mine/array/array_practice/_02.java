// import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int [] arr = {3, 45, 33, 12, 13};
        // int search = sc.nextInt();
        int search = 45;
        int ind=0;
        boolean find = false;

        // for(int element: arr){
        //     if (element == search){
        //         find = true;
        //         ind = element;
        //         break;
        //     }
        // }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == search){
                find = true;
                ind = i;
                break;
            }
        }




        if(find){
            System.out.print("Yes it is present at index: ");
            System.out.println(ind);
        }
        else{
            System.out.println("Not present");
        }


        int [] a = {40, 50, 89, 50, 90};
        int s=0, avg;
        for(int el:a){
            s += el;
        }
        avg = s/a.length;
        System.out.println(s);
        System.out.println(avg);
    }
}
