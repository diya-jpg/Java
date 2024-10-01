import java.util.*;
public class remove_repeat_stack {
    static int [] remove(int []arr){
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<arr.length;i++){
if(st.size()==0||st.peek()!=arr[i]){
    st.push(arr[i]);
}

else if(arr[i]==st.peek()){
    if(i==arr.length-1||arr[i]!=arr[i+1]){
        st.pop();
    }
    
}
  }
int []result=new int[st.size()];
int m=result.length;
for(int j=m-1;j>=0;j--){
result[j]=st.pop();
}
    
        
        return result;
    }

    public static void main(String[]args){
        int[] arr = {1,2,2,3,3,3,5,6,6,7};
        int []result=remove(arr);
        System.out.println(Arrays.toString(result));
    }
}
