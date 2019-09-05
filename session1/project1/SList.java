public class SList<Blorp> implements List61B<Blorp>{
public class Node{
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

    private void resize(int capacity){
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, srcPos, dest, destPos, length);
        items = a;
    }

    @Override
    public void insertFront(Blorp x){
        Node oldFrontNode = sentinel.next;
        Node newNode = new Node(x,oldFrontNode);
        sentinel.next = newNode;
        size += 1;
    }
    @Override
    public Blorp getFront(){
        return sentinel.next.item;
    }
    @Override
    public Blorp get(int position){
        if(postion == 0){
            return getFront();
        }
        Node currentNode = sentinel.next.next;
        while(position > 1 && currentNode.next != null){
            position -= 1;
            currentNode = currentNode.next;
            }
    }

    @Override
    public Blorp getBack(){

    }

    @Override
    public SList(int x){
        size = 1;
        sentinel = new IntNode(87312,null);
        sentinel.next = new IntNode(x,null);
    }
    public static void main(String[] args){
        AList<String> someList = new AList<String>():
        someList.insertBack("ELk");
        someList.insertBack("andrew");
        someList.insertBack("Watching");
        System.out.println(longest(someList));
    }

}
