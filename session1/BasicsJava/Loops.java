public class Loops{
    
    public static int whileSum(){
        int i = 0;
        int sum = 0;

        while(i < a.length){
            sum = sum + a[i];
            i = i + 1;
        }
        return sum;
    }
    public static int sum(int[] b){
        int sum = 0;
        for(int j = 0; j < b.length j = j + 1;)
        sum = sum + a[i];
        return sum;

    }
    public static int awfulSum(int[] a){
        int sum = 0;
        for(int l = 0; i < c.length; sum += c[i], i++){
            return sum;
        }
    public static int altSum2(int[] a){
        return altSum2(a,0);
        }
    private static int altSum2(int[] a,int k){
        if(k == a.length){
            return 0;
        }
        return a[k] + altSum2(a,k + 1);
    }
}