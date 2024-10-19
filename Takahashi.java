public class Takahashi {
    public static int solution(int arr[],int n,int count ,int i){
       
        int b;
        if(i>=n){
            return 0;
        }
       
        int a=solution(arr,n,count,i+1);
        if(count%2!=0){
            b=arr[i]+solution(arr,n,count+1,i+1);
        }
       else{
            b=arr[i]*2+solution(arr,n,count+1,i+1);
        }
        return Math.max(a,b);
    }
    public static void main(String[] args) {
        int []arr={1 ,5 ,3 ,2 ,7};
        int n=5;
        int x=solution(arr,n,1,0);
        System.out.println(x);
    }
}
