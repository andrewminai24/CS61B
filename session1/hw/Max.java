class Max{
    public static void main(String[] args){
        int[] largeArray = {1,2,3,4};

        System.out.println(findLargest(largeArray));
    }
    public static int findLargest(int array[]){
        int largest = array[0];

        for(int i = 0;i< array.length;i++){
         if(array[i] > largest)
             largest = array[i];
        }
        return largest;
    }
}