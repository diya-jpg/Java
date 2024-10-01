import java.util.*;

public class arr1 {

    static int answer(int arr[], int x) {
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                last = i;
            }

        }
        return last;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(answer(arr, x));
    }
}
