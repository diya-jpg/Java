
public class max_string {
    static void x(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                  sum=sum+arr[k];
                   if(max<sum){
                    max=sum;
                   }
                }
               
            }
            }
            System.out.println(max);
    }
    public static void main(String []args){
        int[]arr={1,2,3,4,5};
        x(arr);
    }
}
