public class subarray {
    public static void x(int arr[]){
        
        for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            int sum=0;
            for(int k=i;k<=j;k++){
                 sum=arr[k]+sum;
               
            }
            System.out.println(sum);
        }
        }
    }
    public static void main(String []args){
        int[]arr={1,2,3,4,5};
        x(arr);
    }
}

