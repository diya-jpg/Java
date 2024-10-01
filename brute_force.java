
import java.util.Scanner;

public class brute_force {
    public static void findPrefixSumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
    }
    public static void findPrefixSumMatrix2(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        for(int j=0;j<cols;j++){
            for(int i=1;i<rows;i++){
                matrix[i][j] += matrix[i - 1][j];
        }
    }
}
    public static void brute(int arr[][], int l, int r, int l1, int r1) {
        int sum = 0;
        for (int i = l; i <= l1; i++) {
            for (int j = r; j <= r1; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }

    public static int findSum(int arr[][], int l, int r, int l1, int r1) {
        int sum = 0;
        findPrefixSumMatrix(arr);
        for (int i = l; i <= l1; i++) {
            if (r >= 1) {
                sum += arr[i][r1] - arr[i][r - 1];
            } else {
                sum += arr[i][r1];
            }
        }
        return sum;
    }

    public static int findSum2(int arr[][], int l, int r, int l1, int r1) {
        int ans= 0,sum=0,up=0,left=0,leftUp=0;
        findPrefixSumMatrix2(arr);
        sum=arr[l1][r1];
        if(r>=1){
            left=arr[l1][r-1];
        }
        if(l>=1){
            up=arr[l-1][r1];
        }
        if(l>=1 && r>=1){
            leftUp=arr[l1-1][r1-1];
        }
        ans=sum+up+left-leftUp;
        return ans;
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
        System.out.println("Enter the four boundaries l1,r1,l2,r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("Applying boundaries");
        brute(arr, l1, r1, l2, r2);
        int x = findSum(arr, l1, r1, l2, r2);
        System.out.println(x);
        int y=findSum2(arr,l1,r1,l2,r2);
        System.out.println(y);
    }
}
