public class recursion_reverse {
    public static int rev(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    public static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    static boolean palin(int n){
        return n==rev(n);
    }
    public static void main(String[] args) {
        int n=12344321;
    //    System.out.println( rev(n));
    System.out.println(palin(n));
    }
}
