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

//inserts x into the back of the list
public void insertBack(int x){
  //  items[] = x;
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
}