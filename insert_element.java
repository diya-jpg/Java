import java.util.*;
public class insert_element {
    public static void main(String[]args){
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(9);
        st.push(7);
        System.out.println(st);
        Stack<Integer>rt=new Stack<>();
        for(int i=1;i<2;i++){
            rt.push(st.pop());
        }
        st.push(8);
        while(!rt.isEmpty()){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
