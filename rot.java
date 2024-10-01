import java.util.Scanner;

public class rot {
    // static int []reverse(int[] arr) {
    // int n = arr.length;
    // int j = 0;
    // int[] ans = new int[n];
    // for (int i = n - 1; i >= 0; i--) {
    // ans[j++] = arr[i];
    // }
    // return ans;
    // }
    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
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
        System.out.println("Enter the number");
        int k=sc.nextInt();
        int x[] = rotate(arr,k);
        print(x);
    }

}