import java.util.Scanner;

public class twopoint1 {
    static void swapArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZeroesAndOnes(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swapArray(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
        print(arr);
    }

    // static void sortZerosAndOnes(int[] arr) {
    // int n=arr.length;
    // int zeros=0;
    // for(int i=0;i<n;i++){
    // if(arr[i]==0){
    // zeros++;
    // }
    // }
    // for(int i=0;i<n;i++){
    // if(i<zeros){
    // arr[i]=0;
    // }
    // else{
    // arr[i]=1;
    // }
    // }

    // }

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
        sortZeroesAndOnes(arr);
    }

}