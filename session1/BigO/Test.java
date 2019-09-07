public class Test{
    public void greet(String[] names){
        //O(n)
        String[] copy = new String[names.length];
        
        for(int i = 0;i < names.length;i++)
            System.out.println("hI" + names[i]);
    }