public class Test2{
    public static void log(String[] args){
       //O(n ^ 2)
       for(int number : numbers) //O(n)
            System.out.println(number);
        
        for(int first : numbers) //O(n)
            for(int second : numbers ) //O(n)
                System.out.println(first + " ," second);
    
        }
}