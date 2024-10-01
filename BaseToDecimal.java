import java.lang.Math;
public class BaseToDecimal {
   

    public static void main(String []args){
        int n=1172,a=10,i,count=0,sum=0;
        for(i=n;n!=0;n=n/a){
            int rem=n%a;
            sum=sum+rem*(int)Math.pow(8,count);
            count ++;
        }
   System.out.println(sum); }
    
}

