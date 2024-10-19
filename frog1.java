import java.util.*;
public class frog1 {
    public static int solution(int[] arr, int n,int i) {
        
        if (i == n-1) {
            return 0;
        }
        if (i>=n) {
            return Integer.MAX_VALUE;
        }
        int ans1=Integer.MAX_VALUE;
        int ans2=Integer.MAX_VALUE;
        if(i+1<n){
         ans1 = Math.abs(arr[i] - arr[i + 1] )+ solution(arr,n,i+1);
        }
        if(i+2<n){
          ans2=Math.abs(arr[i] - arr[i + 2]) + solution(arr,n,i+2);
        }
       int s=Math.min(ans1,ans2);
        return s;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 30, 40, 20 };
        int n = 4;
        int x = solution(arr, n,0);
        System.out.println(x);
    }
}
