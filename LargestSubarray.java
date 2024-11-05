import java.util.*;
public class LargestSubarray {
    public static int zeroSumLargestSubarray(int []arr,int n){
HashMap<Integer,Integer>map=new HashMap<>();

int maxlen=0,prefsum=0;
map.put(0,-1);
for(int i=0;i<n;i++){
    prefsum+=arr[i];
    if(map.containsKey(prefsum)){
        maxlen=Math.max(maxlen,i-map.get(prefsum));
    }
    else{
        map.put(prefsum,i);
    }
}
return maxlen;
    }
    public static void main(String[] args) {
        LargestSubarray obj = new LargestSubarray();
        int arr[] = {15,-2,2,-8,1,7, 10};
        int n = arr.length;
System.out.println(zeroSumLargestSubarray(arr,n));
    }
}
