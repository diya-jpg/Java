 
    import java.util.*;
    public class StackNextgreaterelement {
    public static void main(String[] args) {
        int input[] = {56,55,5,53,52,51,50};
        int n = input.length;
        int output [] = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++){
            if(st.empty()){
                st.push(i);
            }

            while(!st.empty() && input[st.peek()]<input[i]){
                output[st.peek()] = input[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.empty()){
            output[st.peek()]= -1;
            st.pop();
        }
        for(int i =0 ; i <n ; i++){
            System.out.print(output[i]+ " ");
        }
    }
    
}

