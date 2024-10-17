public class recursion_sum_alternates {
    static public int  seriessum(int n){
        if(n==0){
            return 0;
        }
    if(n%2==0){
        return seriessum(n-1)-n;
    }
    else{
        return seriessum(n-1)+n;
    }
}
    public static void main(String[] args) {
        int x=seriessum(5);
        System.out.println(x);
    }
}
