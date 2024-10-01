
public class duplicate1{
    static void fun(int[]arr){
        int n=arr.length;
       for(int i=0;i<n;i++){
        int a=Math.abs(arr[i]);
        if(arr[a]<0){
            System.out.println(a);
       }
        arr[a]=-arr[a];
       }
        
    }
    public static void main(String[] args) {
        int []nums = {1,2,3,3,4,5};
    
        fun(nums);
    }
} 