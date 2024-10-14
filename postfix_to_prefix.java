import java.util.Stack;

public class postfix_to_prefix {
    public static void main(String[] args) {
        String s="953+4*6/-";
        Stack<String>st=new Stack<>();
                for(int i =0; i <s.length(); i++){
                    char o=s.charAt(i);
                    if(o>='0'&&o<='9'){
                        st.push(o+""); 
                }
                else {
                    String val1=st.pop();
                    String val2=st.pop();
                    char op=o;
                    String t=op+val2+val1;
                    st.push(t);
                }
            }
            System.out.println(st.pop());
    }
}
