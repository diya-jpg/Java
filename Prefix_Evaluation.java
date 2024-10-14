import java.util.*;
public class Prefix_Evaluation {
    public static void main(String[] args) {
        String s="-9/*+5346";
Stack<Integer>st=new Stack<>();
        for(int i = s.length() - 1; i >= 0; i--){
            int o=s.charAt(i);
            if(o>='0'&&o<='9'){
                st.push(o - '0'); 
        }
        else {
            int val1=st.pop();
            int val2=st.pop();
            switch (o) {
                case '+':
                    st.push(val1 + val2);
                    break;
                case '-':
                    st.push(val1 - val2);
                    break;
                case '*':
                    st.push(val1 * val2);
                    break;
                case '/':
                    st.push(val1 / val2);
                    break;
            }
        }
    }
    System.out.println(st.pop());
}
}
