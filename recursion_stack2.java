import java.util.Stack;

public class recursion_stack2 {
public static void push( Stack<Integer>st,int x){
    if(st.isEmpty()){
st.push(x);
    }
    else{
        int top=st.pop();
        push(st, x);
        st.push(top);
    }
}
    public static void main(String[] args) {
        int k=2;
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
       push(st,k);
       System.out.println(st);
}
}