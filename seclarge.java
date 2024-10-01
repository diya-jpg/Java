import java.util.*;
public class seclarge {
    static int second(int []arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int findSecondMax(int []arr){
        int max = second(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max)
            arr[i]=Integer.MIN_VALUE;
        }
        int secMax=second(arr);
        return secMax;
    }
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }

    System.out.println(findSecondMax(arr));
}
   }

