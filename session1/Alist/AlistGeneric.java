public class Alist<Item>{
    //the stored integers
    int[] items;
    int size;
private static int RFACTOR = 2;



//initilize Alist
public Alist(){
    size = 0;
    items =  (Item[]) new Object[100];
}
/*
Resize our backing array so that it is 
of the given capacity
*/


private void resize(int capacity){
    int[] a = (Item[]) new Object[capacity];
    System.arraycopy(items,0,a,0,size);
    items = a;
}


//inserts x into the back of the list
public void insertBack(int x){
  //  items[] = x;
  int items[];
  if(size == item.length){
      resize(size * REFACTOR);
    }
  items[size] = x;
  size = size + 1;
}

//Returns the item int he back of the list 
public int getBack(){
    return items[size - 1];
    //return items[lastActualItemIndex];
}

//Gets the ith item in the list 
public int get(int i){
    return 0;
}   

public int size(){
    return size;
}

public int deleteBack(){
    Item itemToReturn = getBack();
    /*
    not necessary to preserve
    variants and thus necessary for 
    correctness
    */
    items[size - 1] = 0;
    size = size - 1;
    return itemToReturn;

    }
    public static void main(String[] args){
        Alist  a1 = new Alist();
        int i = 0;
        while(i < 1000){
            a1.insertBack(i);
            i = i + 1;
        }
        System.out.println("Done");
    }
}
