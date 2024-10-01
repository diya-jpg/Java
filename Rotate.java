import java.util.*;
import java.lang.Math;
public class Rotate {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        System.out.println("How much to rotate");
        int r=s.nextInt();
        int b=(int)Math.pow(10,r);
        int div=a%b;
int rem=a/b;
int c=(int)Math.pow(10,r-1);
int y=div*c;
int sum=y+rem;
System.out.println(sum);
    }
}
