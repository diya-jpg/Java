
import java.util.Scanner;

public class mul_matrix {
    static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void mul(int arr[][], int arr2[][], int r, int c, int r1, int c1) {
        if (c != r1) {
            System.out.println("Matrix multiplication is not possible");
            return;
        }
        int arr3[][] = new int[r][c1];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c1; j++) {
                for (int k = 0; k < c; k++) {
                    arr3[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
        print(arr3);
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
        System.out.println("Multiply of two matrices");
        mul(arr, arr2, r, c, r1, c1);

    }
}
