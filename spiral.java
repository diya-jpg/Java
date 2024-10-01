
import java.util.Scanner;

public class spiral{
   
   static void printSpiral(int arr[][],int r,int c){
int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
int totalElements=0;
while(totalElements<r*c){
    for(int i=leftCol;i<=rightCol && totalElements<r*c;i++){
        System.out.print(arr[topRow][i]+" ");
        totalElements++;
}
topRow++;
for(int i=topRow;i<=bottomRow && totalElements<r*c;i++){
    System.out.print(arr[i][rightCol]+" ");
    totalElements++;
   }
   rightCol--;
   for(int i=rightCol;i>=leftCol && totalElements<r*c;i--){
    System.out.print(arr[bottomRow][i]+" ");
    totalElements++;
   }
   bottomRow--;
   for(int i=bottomRow;i>=topRow && totalElements<r*c;i--){
    System.out.print(arr[i][leftCol]+" ");
    totalElements++;
   }
   leftCol++;
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
    
     printSpiral(arr,r,c);
       
      

    
}
}