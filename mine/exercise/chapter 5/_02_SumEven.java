class _02_SumEven{
    static int sumOfFirstEvenNos(int num){
        int sum = 0;
        for(int i=0; i<num; i++){
            sum = sum + (2 * i);
        }
        return sum;
    }
    static int sumEvenWhile(int num){
        int sum = 0;
        num--;
        while(num>=0){
            sum = sum + (2*num);
            num--;
        }
        return sum;
    }
    static int sumOfFirstOddNos(int num){
        int sum = 0;
        for(int j=0; j<num; j++){
            sum = sum + (2 *j +1);
        }
        return sum;

    }

        public static void main(String[] args) {
                System.out.println(sumOfFirstEvenNos(10));

                System.out.println(sumOfFirstOddNos(10));

                System.out.println(sumEvenWhile(10));
        }

    }

    
