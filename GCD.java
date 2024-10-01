import java.util.Scanner;
public class GCD {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of a");
         int a=s.nextInt();
         System.out.println("Enter the value of b");
         int b=s.nextInt();
         int dividend=a;
         int divisor=b;
        // for (int rem=a%b;rem!=0;rem=a%b){
        //     b=rem;
        //     a=b;
        // }
        //  System.out.println(b);
        //  int lcm=(dividend*divisor)/b;
        //  System.out.println(lcm);
        while(divisor!=0){
           int  rem=dividend%divisor;
            dividend=divisor;
                divisor=rem;
        }
        System.out.println("HCF"+dividend);
        
         
    }
}
