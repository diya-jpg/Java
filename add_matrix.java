
import java.util.Scanner;

public class add_matrix {
    static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] add(int arr[][], int arr2[][], int r, int c, int r1, int c1) {
        if (r != r1 && c != c1) {
            System.out.println("Matrix addition is not possible");
            return null;
        }
        int arr3[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr3[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        return arr3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the numbers");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value of r");
        int r1 = sc.nextInt();
        System.out.println("Enter the value of c");
        int c1 = sc.nextInt();
        int[][] arr2 = new int[r1][c1];
        System.out.println("Enter the numbers");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of two matrices");
        int[][] arr3 = add(arr, arr2, r, c, r1, c1);
        if (arr3 != null) {
            print(arr3);
        }
    }
}
