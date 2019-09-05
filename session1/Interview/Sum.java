import java.util.*;

public class Sum{
    public static void main(String[] args){
        hasPairWithSum(1,2,3,4,5,1);
    }

    public static boolean hasPairWithSum(ArrayList<Integer>data,int sum){

        ArrayList<Integer> A = new ArrayList<Integer>();
        int low = 0;
        int hi = data.size()-1;
    
        while(low < hi){
            if(data[low]+data[hi] == sum){
                return true;
            }
        }

    }
}