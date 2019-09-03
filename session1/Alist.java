//Array based list
//Author Andrew Minai

//[5,9,13]
public class Alist{
    //the stored integers
    int[] items;
    int size;




//initilize Alist
public Alist(){
    size = 0;
    items = new int[100];
}
/*
Resize our backing array so that it is 
of the given capacity
*/


private void resize(int capacity){
    int[] a = new int[capacity];
    System.arraycopy(items,0,a,0,size);
    items = a;
}


//inserts x into the back of the list
public void insertBack(int x){
  //  items[] = x;
  if(size == item.length){
      int[] a = new int[size + 1];
      System.arraycopy(items,0,a,0,size);
        items = a;
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
    int itemToReturn = getBack();
    /*
    not necessary to preserve
    variants and thus necessary for 
    correctness
    */
    items[size - 1] = 0;
    size = size - 1;
    return itemToReturn;

    }
}
/*
Resizing array code 
public void insertBack(int x){
    if(size == items.length){
    int[] a = new int[size + 1];
    System.arraycopy(items,0,a,0,size);
    items = a; 
    }
    items[size] = x;
    size += 1;
}

Better Solution:
private void resize(int capacity){
    int [] a = new int[capacity];
    System.arraycopy)(items,0,a,0,size)
    items = a;
}
public void insertBack(int x){
    if(size == items.length){
        resize(size + 1);
    }
    items[size] = x;
    size += 1;
}

*/
