import java.util.*;
public class Two_sum {
    public static int[]twosum(int []nums,int target){
int []ans={-1};
HashMap<Integer,Integer>map=new HashMap<>();

for(int i=0;i<nums.length;i++){
   int partner=target-nums[i];
   if(map.containsKey(partner)){
    ans=new int[]{i,map.get(partner)};

}
map.put(nums[i],i);
    }
    return ans;
}
    public static void main(String[] args) {
        int arr[]={14,7,10,4,5,9,1,2};
        int x[]=twosum(arr,13);
System.out.println(x[0]);
System.out.println(x[1]);
    }
}
