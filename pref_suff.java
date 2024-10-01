
import java.util.Scanner;
public class pref_suff{
static int findArraySum(int []arr){
    int totalSum=0;
    for(int i=0;i<arr.length;i++){
        totalSum+=arr[i];
    }
    return totalSum;
}
static boolean equalSumPArtition(int []arr){
    int totalSum=findArraySum(arr);
    int prefSum=0;
    for(int i=0;i<arr.length;i++){
        prefSum+=arr[i];
        int suffixSum=totalSum+prefSum;
        if(suffixSum==prefSum){
            return true;
        }
    }
    return false;
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
   
   System.out.println(equalSumPArtition(arr));
 
}

}