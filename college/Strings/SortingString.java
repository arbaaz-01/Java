public class SortingString {
    public static void main(String[] args) {
        
        // String [] s1 = {"Zebra", "Lion", "Ape", "Baboon"};
        String [] s1 = {"Jiraffe", "Zebra", "Lion", "Ape", "Baboon"};
        String temp = null;
        for(int i=0; i<s1.length; i++){
            for(int j=i+1; j<s1.length; j++){
                if (s1[j].compareTo(s1[i])<0){
                    temp = s1[i];
                    s1[i] = s1[j];
                    s1[j] = temp;
                }
            }

            }
           
            for(
                
                String e:s1)
                {
                    System.out.println(e);
                }
            }

}
