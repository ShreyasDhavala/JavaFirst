public class SumMultiplesOfTen {

    public static void main(String args[]){
        SumMultiplesOfTen s=new SumMultiplesOfTen();
        int total = s.sumMultOfTen(100);
        System.out.println(total);
    }
    public int sumMultOfTen(int num){
        int sum = 0;
        for(int i = 10; i<=num; i+=10){
            sum+=i;
        }
        return sum;
    }

}
