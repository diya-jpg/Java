
import java.util.Scanner;

public class pascal{
    static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int [] [] pyramid(int n){
      int ans[][]=new int[n][];
      for(int i=0;i<n;i++){
        ans[i]=new int[i+1];
        ans [i][0]=ans[i][i]=1;
        for(int j=1;j<i;j++){
            ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
        }
      }
      return ans;
    }

  
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
       
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
     int [][] arr=pyramid(n);
        print(arr);
      

    }
}
