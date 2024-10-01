import java.util.Scanner;
public class generate_spiral{
    static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
   static int [][] gen_Spiral(int n){
int topRow=0,bottomRow=n-1,leftCol=0,rightCol=n-1;
int curr=1;
int [][]matrix=new int [n][n];
while(curr<=n*n){
    for(int i=leftCol;i<=rightCol && curr<=n*n;i++){
       matrix[topRow][i]=curr++;
       
}
topRow++;
for(int i=topRow;i<=bottomRow && curr<=n*n;i++){
    matrix[i][rightCol]=curr++;
    
  }
   rightCol--;
   for(int i=rightCol;i>=leftCol && curr<=n*n;i--){
    matrix[bottomRow][i]=curr++;
    
   
   }
   bottomRow--;
   for(int i=bottomRow;i>=topRow && curr<=n*n;i--){
  matrix[i][leftCol]=curr++;
  
    
   }
   leftCol++;
}
return matrix;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of r");
        int n= sc.nextInt();
     int arr[][]= gen_Spiral(n);
print(arr);
    
}
}