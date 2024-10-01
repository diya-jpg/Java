import java.util.*;
public class Fibonacci {
    public static void main(String[]args){
        int a=0;
        int b=1;
        
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n");
int n=sc.nextInt();
System.out.println(a);
System.out.println(b);
for(int i=2;i<n;i++){
    int c=a+b;
    System.out.println(c);
    a=b;
    b=c;
}
    }
}
