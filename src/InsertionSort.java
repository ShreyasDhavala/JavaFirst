public class InsertionSort {
    public static void insertSort(int[] arr)
    {
        for(int i =0; i<arr.length; i++)
        {
            //my Way, optimize later
            int j =i;
            while(j>0 && arr[j] < arr[j-1])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        print(arr);
    }
    public static void print(int[] array){
        for(int val: array){
            System.out.print(val);
        }
    }

    public static void main(String args[])
    {
        int[] myArray = {1,5,2,4,10,100000};
        insertSort(myArray);
    }
}
