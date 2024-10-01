import java.util.*;
public class Digit {
    public static void main(String[]args){
        int count=0,i;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a=s.nextInt();
        for(i=a;i!=0;i=i/10){
            count++;
        }
        int b;
        for(int j=count-1;j>=0;j--){
          b=(int) Math.pow(10,j);
            int ans=a/b;
System.out.println(ans);
a=a%b;
        }
    }
}
