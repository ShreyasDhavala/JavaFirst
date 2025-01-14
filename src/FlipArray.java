import java.util.Arrays;

public class FlipArray {
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5,6,7,8};
        int index1 = 0;
        int index2 = arr.length-1;
        while(index1 < index2)
        {
            int temp = arr[index2];
            arr[index2] =  arr[index1];
            arr[index1] = temp;
            index1++;
            index2--;
        }
        for(int i:arr)
            System.out.print(i);
    }
}
