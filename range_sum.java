
import java.util.Scanner;
public class range_sum{

static int []  target2(int []arr){
    int n=arr.length;
  
  for(int i=1;i<n;i++){
arr[i]=arr[i-1]+arr[i];
  }
return arr;
}


public  static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    
    int arr[] = new int[n+1];
    System.out.println("Enter the elements of the array:");
    for (int i = 1; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
   
   int []pref=target2(arr);
   System.out.println("Enter the numbers");
   int q=sc.nextInt();
   while(q-- >0){
    System.out.println("Enter the range");
    int l=sc.nextInt();
    int r=sc.nextInt();
    int ans=pref[r]-pref[l-1];
    System.out.println("Sum"+ans);
   }
 
}

}