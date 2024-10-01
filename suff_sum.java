import java.util.Scanner;
public class suff_sum{

static int []  target2(int []arr){
    int n=arr.length;
  
  for(int i=n-2;i>=0;i--){
arr[i]=arr[i+1]+arr[i];
  }
return arr;
}
static void printarray(int []arr){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
}
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
   
    int x[]=target2(arr);
    printarray(x);
}

}