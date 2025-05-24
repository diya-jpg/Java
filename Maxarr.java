public class Maxarr {
    
        public static int subarraySum(int[] nums, int k) {
            int n=nums.length;
         int maxm= Integer.MIN_VALUE;
            int count=0;
            int b=0;
            for(int i=0;i<n-k;i++){
              for(int j=0;j<k;j++){
                   b=nums[i]+nums[i+1];
              }
    count=Math.max(count,b);
     maxm=Math.max(maxm,count);
            }
           
             return maxm;
        }
       
    
    public static void main(String []args){
        int arr[]={1,2,3};
        int x=subarraySum(arr,2);
        System.out.println(x);
    }
}
