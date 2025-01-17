import java.util.Arrays;

public class ArrayRotateReverse {
    public static void rotateLeft(int[] arr)
    {
        int temp = arr[0];
        for(int i = 1; i<arr.length; i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1] = temp;
    }
    public static void rotateRight(int[] arr)
    {
        // 51, 61, 71, 81, 91
        // 91, 51, 61, 71, 81
        int temp = arr[arr.length-1];

        for(int i = arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    public static void reverse(int[] arr)
    {
        for(int k = 0; k<((arr.length)/2); k++){
           int temp = arr[k];
           arr[k] = arr[arr.length-k-1];
           arr[arr.length-k-1] = temp;
        }
    }
    public static void main(String[] args)
    {
        int[] array1={51, 61, 71, 81, 91};
        int[] array2=array1.clone();
        int[] array3=array1.clone();

        rotateLeft(array1);
        System.out.println("after left rotate: "+Arrays.toString(array1));

        rotateRight(array2);
        System.out.println("after right rotate: "+ Arrays.toString(array2));

        reverse(array3);
        System.out.println("after flip: "+Arrays.toString(array3));
        }


}
