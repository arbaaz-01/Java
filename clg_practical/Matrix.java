import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] a, b, c;
        int r1, c1, r2, c2;
        System.out.println("Enter row of Matrix one");
        r1 = sc.nextInt();
        System.out.println("Enter column of Matrix one");
        c1 = sc.nextInt();
        System.out.println("Enter row of Matrix Two");
        r2 = sc.nextInt();
        System.out.println("Enter column of Matrix Two");
        c2 = sc.nextInt();
        a = new int[r1][c1];
        b = new int[r2][c2];
        c = new int[a.length][b[0].length];
        System.out.println("Enter elements of Matrix One");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix Two");
        for(int i=0; i<b.length; i++){
            // System.out.printf("Row %d Elements\n",i);
            for(int j=0; j<b[i].length; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix One: ");
        for(int i=0; i<a.length; i++){
            // System.out.printf("Row %d Elements\n",i);
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("Matrix Two: ");
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[i].length; j++){
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }

        if(c1 != r2){
            System.out.println("Matrix multiplication not possible");
        }
        else{
            for(int i=0; i<a.length; i++){
                for(int j=0; j<b[0].length; j++){
                    c[i][j] = 0;
                    for(int k=0; k<a[0].length; k++){
                        c[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(c[i][j]+"  ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
