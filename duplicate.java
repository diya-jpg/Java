 public class duplicate{
    static void fun(int[]arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                
                System.out.println(arr[i]+"is duplicate");
                break;
                 
            }
           
          }
          
        }
        
    }
    public static void main(String[] args) {
        int []nums = {5,4,3,2,5,1,3};
    
        fun(nums);
    }
} 