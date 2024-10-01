import java.util.*;
public class stack_str_bal {
    static boolean isbalanced(String s){
Stack<Character>st=new Stack<>();
int n=s.length();
for(int i=0;i<n;i++){
    char b=s.charAt(i);
    if (b == '(') {
        st.push('(');
    } else if (b == ')') {
        if (st.size() == 0) {
            return false;
        }
        if (st.peek() == '(') {
            st.pop();
        }
    }
}
if(st.size()>0){
    return false;
}
return true;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        boolean x=isbalanced(str);
        System.out.println(x);
    }
}
