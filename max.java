import java.util.Scanner;

public class max {
    public static void main(String []args){
         Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    
    int arr[] = new int[n+1];
    System.out.println("Enter the elements of the array:");
    for (int i = 1; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
        }
       
    }
    System.out.println("Maximum element in array is: "+max);
}
}
