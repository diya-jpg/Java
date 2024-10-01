import java.util.Scanner;
public class target_sum {
    static int  target(int []arr,int target){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
        }
    }
    return ans;
}
public  static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the target");
    int tar = sc.nextInt();
    System.out.println(target(arr,tar));
}

}