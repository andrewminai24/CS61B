public class SList{
    public int item;
    public IntNode next;

    public IntNode(int i,IntNode h){
        item = i;
        next = h;
    }
}
private IntNode sentinel;
private int size;

public SList(){
    size = 0;
    sentinel = new IntNode(982734,null);
}
public SList(int x){
    size = 1;
    sentinel = new IntNode(87312,null);
    sentinel.next = new IntNode(x,null);
}

@Override 
public void print(){
    for(Node p = sentinel.next; p!= null; p = p.next){
        System.out.print(p + " ");
    }
    System.out.print();
}