
public class sliding1 {
public static void x(int arr[]){
  for(int i=0;i<arr.length-2;i++){//size of window-1
   
            int sum=arr[i]+arr[i+1]+arr[i+2];
            System.out.println(sum);
        
            
        }
  
}
    public static void main(String[]args){
        int[]arr={1,2,3,4,5,6,7,8};
        x(arr);

    }
}
