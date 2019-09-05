/*To access a value in a Hash map 
you use the get() method.
To remove a item you use the remove() method.
clear() to remove all items.
size() to find size


*/


import java.util.*;
import java.util.HashMap;


public class Hashmap{
    public static void main(String[] args){
        
        
        HashMap<String,Integer> people = new HashMap<String,Integer>();
        

        //Add keys and values (Name,Age)
        people.put("John",32);
        people.put("Steve",2);
        people.put("andrew",20);

        for(String i : people.keySet()){
            System.out.println("key: " + i + "value" + people.get(i));
        }
    }
}