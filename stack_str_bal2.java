import java.util.*;
public class stack_str_bal2{
    static void isbalanced(String s){
        int open=0;
        int close=0;
Stack<Character>st=new Stack<>();
int n=s.length();
for(int i=0;i<n;i++){
    char b=s.charAt(i);
    if(b=='('){
        open++;
    }
    else if(b==')'){
        if (open > 0) {
            open--;  
        } else {
            close++; 
        }
    }
}
System.out.println(open+close);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        isbalanced(str);
      
    }
}
