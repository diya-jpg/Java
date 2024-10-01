import java.util.*;
public class next_greater {
    // static int[] number(int arr[]){
    //     int n = arr.length;
    
    //     int []res=new int[n];
    //     for(int i=0;i<n;i++){
    //         res[i]=-1;
    //       for(int j=i+1;j<n;j++){
    //         if(arr[i]<arr[j]){
    //             res[i]=arr[j];
    //             break;
    //         }
    //       }
         
    //     }
    //     return res;
    // }
    static Stack<Integer> number1(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<Integer>();
        Stack<Integer> result = new Stack<Integer>();
        
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.empty()){
                result.push(-1);
            } else {
                result.push(st.peek());
            }
            st.push(arr[i]);
        }
        return result;
    }
    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }  public static void main(String[]args){
     int []arr={1,3,2,1,8,6};
     //int x[]=number(arr);
     System.out.println(number1(arr));
//print (x);
    }
}
