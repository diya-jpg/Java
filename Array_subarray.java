import java.util.HashMap;

public class Array_subarray {
    public static int sub_arr(int nums[],int k){
        HashMap<Integer,Integer>map=new HashMap<>();
  int sum=0;
 int count=0;
  map.put(0, 1); 
  for(int i=0;i<nums.length;i++){
    sum+=nums[i];
   
    
    if(map.containsKey(sum-k)){
        count += map.get(sum - k);
    }
    if(!map.containsKey(sum)){
        map.put(sum,1);
    }
else{
    map.put(sum,map.get(sum)+1);
}
  }
  return count;
    
    }
    public static void sub_array(int []arr,int size){
int i=0;
int j=0;
while(j<arr.length){
    if(j-i+1<size){
        j++;
    }
    else if(j-i+1==size){
        int sum=0;
for(int k=i;k<=j;k++){
    sum+=arr[k];
    System.out.print(arr[k]+" ");
}
System.out.println("->"+sum);
i++;
j++;
    }
}
    }
 
    public static void main(String[] args) {
        int arr[]={5,1,2,4,9,3,1,3,3};
        int size=3;
        int equal=7;
      System.err.println(  sub_arr(arr,size));
      sub_array(arr,equal);
    }

}
