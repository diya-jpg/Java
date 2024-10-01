
import java.util.Scanner;

public class tranpose_matrix{
    static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    // static void tranpose1(int arr[][],int r, int c) {
        
    //     int arr3[][] = new int[c][r];
    //     for (int i = 0; i < c; i++) {
    //         for (int j = 0; j < r; j++) {
    //             arr3[i][j]=arr[j][i];
    //         }
    //     }
    //     print(arr3);
    // }
    static void  tranpose2(int arr[][],int r, int c) {
        
        
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        
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
        
        System.out.println("Tranpose of matrix");
        tranpose2(arr, r, c);
        print(arr);

    }
}
