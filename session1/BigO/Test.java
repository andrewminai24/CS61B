public class Test{
    public void greet(String[] names){
        //O(n)
        String[] copy = new String[names.length];
        
        for(int i = 0;i < names.length;i++)
            System.out.println("hI" + names[i]);
    }

/*
To look up an array it is O(1)
Arrays are static in Java
to add another item we have to resize the array.
which means we have to add a larger array and then
copy all the items in the old array into the new array.
This operation can be costly this is why our big O changes
from O(1) to O(n).
*/
