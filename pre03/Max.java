public class Max {
    public static void main(String[] args){
        int[] largeArray = {7,9,12,15,2,4,9,10,17};

        System.out.println(Max(largeArray));
    }

    public static int Max(int array[]){
        int largest = array[0];
        int largestIndex = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > largest)
                largest = array[i];
                largestIndex = i;
        }
 
        return largestIndex;
    }
}