import java.util.HashMap;

public class Longest_subarraywithsumk {
      public  static int longestSubarray(int[] nums, int k) {
    HashMap<Integer,Integer>map=new HashMap<>();
    int sum=0;
    
    int maxn=0;
    for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
       if(sum==k){
        maxn=i+1;
       }
        if(map.containsKey(sum-k)){
            int len=i-map.get(sum-k);
            maxn=Math.max(len,maxn);
        }
        if(!map.containsKey(sum)){
                map.put(sum,i);
             }
             
    }
    return maxn;
    }
    public static void main(String[] args) {
        int []nums = {-3, 2, 1};
        int k=6;
        int answer=longestSubarray(nums,k);
        System.out.println(answer);
    }
}
