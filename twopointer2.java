import java.util.Scanner;

public class twopointer2 {
    

   static void sum(int []arr,int k){
    int right=arr.length-1;
    int left=0;
    
while(left<right){
    int sum=arr[left]+arr[right];
    if(sum==k){
        System.out.println(left+","+right);
    
    left++;
    right--;
    }
    else if(sum<k){
left++ ;
    }
    else{
        right--;
    }
}
if(left==right){
    return;
}

   }

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value");
       int k=sc.nextInt();
       sum(arr,k);
    }

}