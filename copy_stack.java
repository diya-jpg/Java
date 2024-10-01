import java.util.*;
public class copy_stack {
    public static void main(String[]args){
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("st:"+st);
        Stack<Integer>rt=new Stack<>();
        for(int i=0;st.size()>0;i++){
            rt.push(st.pop());
        }
        System.out.println("rt:"+rt);
        Stack<Integer>gt=new Stack<>();
        for(int i=0;rt.size()>0;i++){
            gt.push(rt.pop());
        }
        System.out.println("gt:"+gt);
    }
}
