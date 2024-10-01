//import java.util.Scanner;

import java.util.Scanner;

public class print_2D {
    static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        

    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
       System.out.println("Enter the value of r");
       int r=sc.nextInt() ;
       System.out.println("Enter the value of c");
       int c=sc.nextInt() ;
       int[][] arr = new int[r][c];
       System.out.println("Enter the numbers");
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            arr[i][j]=sc.nextInt();
        }
       }
       System.out.println("Print Array");
       print(arr);
    }
}
