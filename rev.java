import java.util.Scanner;

public class rev {
    // static int []reverse(int[] arr) {
    // int n = arr.length;
    // int j = 0;
    // int[] ans = new int[n];
    // for (int i = n - 1; i >= 0; i--) {
    // ans[j++] = arr[i];
    // }
    // return ans;
    // }
    static void swapArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swapArray(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
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
        System.out.println("Enter the number to rotate");
        int k = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rotateInPlace(arr, k);
        print(arr);
    }

}