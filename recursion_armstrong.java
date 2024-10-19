import java.util.*;
import java.lang.Math;
public class recursion_armstrong {
    public static int check(int p,int q){
    
        if (p== 0) {
            return 0;
        }
        int digit=p%10;
        
       
        
        return (int)Math.pow(digit,q) + check(p / 10, q);
    }
    public static void main(String[] args) {
        int p = 127;
       int q=3;
  
        int x=check( p, q);
        if(x==p){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
