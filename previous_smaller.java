import java.util.Stack;

public class previous_smaller {
     static int[]number1(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack<Integer>();
      int result[]=new int[arr.length];
        result[0]=-1;
st.push(0);
        for(int i=1;i<n;i++){
            while(!st.empty() && arr[st.peek()] >arr[i]){
                st.pop();
            }
            if(st.empty()){
               result[i]=-1;
            } 
            else {
               result[i]=arr[st.peek()];
            }
            st.push(i);
        }
        return result;
    }
    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }  public static void main(String[]args){
     int []arr={2,5,1,3,9,8};
   int x[]=number1(arr);
   print(x);
    }
}


