public class Mode {
    static int[] array = {1,2,1,2,3,4,5,3};
    public static void duplicate()
    {
        int maxCount =0;
        int value = 0;

        for(int i =0; i< array.length; i++){
            int count = 1;
           for(int j=(i+1); j<array.length; j++){
               if(array[i]==array[j]){
                   count++;
               }
           }
           if(count>maxCount){
               maxCount = count;
               value = array[i];
           }
        }
        if(maxCount == 0){
            System.out.println("There is no mode.");
        }
        else{
            System.out.println("The mode is " + value + " which reoccurs "+ maxCount + " times.");
        }
    }
    public static void main(String args[]){
        duplicate();
    }
}
