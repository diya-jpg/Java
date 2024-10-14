import java.util.Stack;

public class prefix_to_postfix {
    public static void main(String[] args) {
        String s="-9/*+5346";
        Stack<String>st=new Stack<>();
                for(int i = s.length() - 1; i >= 0; i--){
                    char o=s.charAt(i);
                    if(o>='0'&&o<='9'){
                        st.push(o+""); 
                }
                else {
                    String val1=st.pop();
                    String val2=st.pop();
                    char op=o;
                    String t=val1+val2+op;
                    st.push(t);
                }
            }
            System.out.println(st.pop());
    }

}
