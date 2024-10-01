
import java.util.Scanner;
class zero_remove{
    static int[] fun(int arr[],int arr2[]){
       
       int index=0;
        for(int i=0;i<arr.length;i++){
           
         
            if(arr[i]!=0){
            arr2[index]=arr[i];
          index++;
            }
       }
       return arr2;
    }
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int arr[]=new int[n];
      
       System.out.println("Enter the numbers");
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                count++;
            }
        }
         int arr2[]=new int[count];
     int x[]=fun(arr,arr2);
     print(x);
    }
}
       
    