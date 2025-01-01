public class SumOfDigits {
    public static void main(String args[]){
        SumOfDigits newNum = new SumOfDigits();
        int numDigits = newNum.sumOfDigits(12345);
        System.out.println(numDigits);
    }
    public int sumOfDigits(int num){
        int i =num;
        int sum = 0;
        while(i>0){
            sum = sum +(i%10);
            i=i/10;
        }
        return sum;
    }
}
