public class numberSorting{
    public static void AscSorting(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i=0; i<a.length; i++){
            for(int j=0+i; j<a.length; j++){
                if(a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("---Ascending Sorting---");
        for(int k=0; k<a.length; k++){
            System.out.print(a[k] + " ");
        }
    }
    public static void DescSorting(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for(int i=0; i<a.length; i++){
            for(int j=0+i; j<a.length; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("---Descending Sorting---");
        for(int k=0; k<a.length; k++){
            System.out.print(a[k] + " ");
        }
    }
    public static void main(String[] args) {
        int[] a = {18, 23, 1, -90, 5, 4, 2};
        System.out.println("---Before Sorting---");
        AscSorting(a);
        DescSorting(a);
    }
}









        // int[] sortedA = new int[a.length];
       

        //  for(int i=0; i<a.length-1; i++){
        //     boolean swapped = false;
        //     for(int j=0; j<a.length-i-1; j++){
        //         if(a[j+1] < a[j]){
        //             swapped = true;
        //             int temp = a[j+1];
        //             a[j+1] = a[j];
        //             a[j] = temp;
        //         }
        //     }
        //     if(!swapped){
        //         break;
        //     }
        // }
        // for(int i=0 ; i<a.length; i++){
        //     System.out.print(a[i]+" ");
        // }
        