
import java.lang.Math;

public class DecToBase{
    public static void main(String []args){
        int n=634,a=8,i,count=0,sum=0;
        for(i=n;n!=0;n=n/a){
            int rem=n%a;
            sum=sum+rem*(int)Math.pow(10,count);
            count ++;
        }
   System.out.println(sum); }
    
}
