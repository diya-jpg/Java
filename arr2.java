import java.util.*;
import java.util.Arrays;
public class arr2 {
static int [] smallestAndLargestElement(int []arr){
    Arrays.sort(arr);
    int ans[]={arr[0],arr[arr.length-1]};
    return ans;
}
    static boolean issorted(int arr[]) {
        boolean check=true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]) {
               check=false;
               return false;
            }

        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(issorted(arr));
       int ans[]=smallestAndLargestElement(arr);
       System.out.println("The smallest element is: "+ans[0]);
       System.out.println("The largest element is: "+ans[1]);
    }
}
