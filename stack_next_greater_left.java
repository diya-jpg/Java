import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class stack_next_greater_left {
    public static void print(ArrayList<Integer>arr){
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
     public  static ArrayList<Integer> nextLargerElement_left(int[] arr) {
        // code here
        Stack<Integer>st=new Stack<>();
        ArrayList<Integer>result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
        while(!st.isEmpty()&& st.peek()<arr[i]){
            st.pop();
        }
         if(st.isEmpty()){
           result.add(-1);
         }  
         else{
            result.add(st.peek());
         } 
         st.push(arr[i]);
        }
      
        return result;
    }
    
     public  static ArrayList<Integer> nextLargerElement_right(int[] arr) {
        // code here
        Stack<Integer>st=new Stack<>();
        ArrayList<Integer>result=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
        while(!st.isEmpty()&& st.peek()<arr[i]){
            st.pop();
        }
         if(st.isEmpty()){
           result.add(-1);
         }  
         else{
            result.add(st.peek());
         } 
         st.push(arr[i]);
        }
      Collections.reverse(result);
        return result;
    }
    public  static ArrayList<Integer> nextSmallerElement_left(int[] arr) {
        // code here
        Stack<Integer>st=new Stack<>();
        ArrayList<Integer>result=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
        while(!st.isEmpty()&& st.peek()>arr[i]){
            st.pop();
        }
         if(st.isEmpty()){
           result.add(-1);
         }  
         else{
            result.add(st.peek());
         } 
         st.push(arr[i]);
        }
      
        return result;
    }
     public  static ArrayList<Integer> nextSmallerElement_right(int[] arr) {
        // code here
        Stack<Integer>st=new Stack<>();
        ArrayList<Integer>result=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
        while(!st.isEmpty()&& st.peek()>arr[i]){
            st.pop();
        }
         if(st.isEmpty()){
           result.add(-1);
         }  
         else{
            result.add(st.peek());
         } 
         st.push(arr[i]);
        }
      Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4};
        int arr2[]={4,5,2,10,8};
        ArrayList<Integer>get=nextLargerElement_left(arr);
        print(get);
         ArrayList<Integer>get2=nextLargerElement_right(arr);
        print(get2);
           ArrayList<Integer>get3=nextSmallerElement_left(arr2);
        print(get3);
           ArrayList<Integer>get4=nextSmallerElement_right(arr2);
        print(get4);
    }
}
