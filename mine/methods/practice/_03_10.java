public class _03_10 {
    static int sumNaturals(int num){
        if(num==1){
            return num;
        }
        else{
            return num + sumNaturals(num - 1);
        }
    }

    static int sumNaturalsRecur(int num){
        int sum=0;
        for(int i=1; i<=num; i++){
            sum+=i;
        }
        return sum;
    }

        public static void main(String[] args) {
            int res = sumNaturals(10);
            System.out.println(res);
            int res2 = sumNaturalsRecur(10);
            System.out.println(res2);
    }
}
