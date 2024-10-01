import java.util.*;
public class Count{
    public static void main(String []args){
        int count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        for(int i=a;i!=0;i=i/10){
             count++;
        }
System.out.println(count+"= no.of digits in the number");
    }
}
