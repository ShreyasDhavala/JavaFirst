public class MinMax {
    static int[] array = {1,2,1,5,4,1,9,-7};

   public static void main(String args[])
   {
       System.out.println("The smollest number gonna be " + findMin(array));
       System.out.println("The biggest numbre dothet beth "+ findMax(array));

   }



    public static int findMin(int[] array)
    {
       //int min = Integer.MAX_VALUE;
        int min = array[0];
       for(int i: array)
       {
           if(i<min)
           {
               min = i;
           }
       }
       return min;
    }

    public static int findMax(int[] array)
    {
        //int max = Integer.MIN_VALUE;
        int max = array[0];
        for(int i: array)
        {
            if(i>max)
            {
                max = i;
            }
        }
        return max;
    }
}
