import java.util.*;
public class Postfix_Evaluation {
    public static void main(String[] args) {
        String s="953+4*6/-";
Stack<Integer>st=new Stack<>();
        for(int i =0; i<s.length(); i++){
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
