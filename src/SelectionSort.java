public class SelectionSort {
    public static void arraySort(int[] array)
    {
        for(int i=0; i < array.length-1; i++)
        {
            //int min = array[i];
            int index = i;
            for(int j = i; j < array.length; j++)
            {
                if(array[index] > array[j])
                {
                    index = j;
                }
            }
            if(index!=i) {
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                //print(array);
            }
        }
    }
    public static void main(String args[])
    {
        int[] myArray = {3, 4, 2, 1,100,54,-12};
        arraySort(myArray);
        print(myArray);
    }
    public static void print(int[] array)
    {
        for(int val : array)
        {
            System.out.print(val + " ");

        }
        System.out.println("");
    }
}
