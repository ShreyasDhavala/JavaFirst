public class BubbleSort {
    public static void bubbleSort(int[] arr)
    {
        //for(int j = 0; j < arr.length, isSorted == false ; j++){
        int j = 0;
        while(j < arr.length-1) {
            boolean isSwapped = false;

            for (int i = 0; i < arr.length - j-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                return;
            }

            j++;
        }
    }
    public static void main(String args[])
    {
        int[] myArray = {4,3,2,1};
        bubbleSort(myArray);
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

