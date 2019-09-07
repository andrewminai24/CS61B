/*
To look up an array it is O(1)
Arrays are static in Java
to add another item we have to resize the array.
which means we have to add a larger array and then
copy all the items in the old array into the new array.
This operation can be costly this is why our big O changes
from O(1) to O(n).

insert O(n)
Delete O(1)
lookup O(1)
*/
import java.util.Arrays;

public class Arr{
    public static void main(String[] args){
        int[] numbers = {10,20,30};
        System.out.println(numbers.length);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
    }
}