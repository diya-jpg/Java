import java.util.*;
public class repeat{
    static int rep(int []arr){
       
        for(int i=0;i<arr.length;i++){
          for(int j=1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                return arr[i];
          }
        }
       
    }
    return -1;
}
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }

    System.out.println(rep(arr));
}
}
   

