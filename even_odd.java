import java.util.Scanner;
public class even_odd {
    public static int fun(int n){
        if(n%2==0){
           // System.out.println(n+" is even");
    return n;
        }
        return -1;
    }
    public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
System.out.println(fun(a));
    }
}
