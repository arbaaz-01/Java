import java.util.ArrayList;

public class SubStrOfStr {

     static void arr(){
        int[] myarr = new int[5];
        for(int i=0; i<myarr.length; i++){
            System.out.println(myarr[i]);
        }
    }
    
    public static void main(String[] args) {
        
        String s = "abcda";

        ArrayList subStr = new ArrayList<>();

        // System.out.println(s.substring(0, 2));

        int count=0;
        // for(int i=0; i<s.length(); i++){

        //     for(int j=i+1; j<=s.length(); j++){

        //         // System.out.println(s.substring(i, j));
        //         subStr.add(s.substring(i, j));
                
        //     }
        // }

//         String [] ab = new String[5];
//         int c=0;
//         for(int i=0; i<subStr.length; i++){
//             if(subStr[i] != null) {System.out.print(subStr[i]+" ");
//             if(subStr[i].length()==3) {
//                 ab[c] = subStr[i];
//                 c++;
//             }
//         }
//         }
// System.out.println();
//         for(String e:ab){
//             System.out.print(e+" ");
//         }


        arr();
    }
}
