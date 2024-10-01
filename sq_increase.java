import java.util.Scanner;
import java.math.*;

public class sq_increase {

    static int[] sortsquare(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = n - 1;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k] = arr[left] * arr[left];
                k--;
                left++;
            } else {
                ans[k] = arr[right] * arr[right];
                k--;
                right--;
            }
        }
        return ans;
    }

    static void printarr(int arr[]){
    for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
    }
    }
    // static void printoriginal(int[] arr) {
    //     int n = arr.length;
    //     for (int i = n - 1; i >= 0; i--) {
    //         System.out.println(arr[i]);
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = sortsquare(arr);
        printarr(ans);

        // System.out.println("Reversed Array");
        // printoriginal(ans);
    }

}