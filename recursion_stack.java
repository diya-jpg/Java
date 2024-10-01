import java.util.*;
public class recursion_stack {
    public static void display(Stack<Integer>a){
       
       if(a.size()==0){
        return;
       }
       int top=a.pop();
       System.out.println(top);
       display(a);
       a.push(top);
      
    }
    public static void display2(Stack<Integer>a){
       
        if(a.size()==0){
         return;
        }
        int top=a.pop();
       
        display(a);
        System.out.println(top);
        a.push(top);
       
     }
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(5);
        st.push(6);
        st.push(7);
// display(st);
 display2(st);
    }
}
