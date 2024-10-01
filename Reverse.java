import java.util.*;
public class Reverse {
    
    public static void main(String []args){
    int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        for(int num=a;a!=0;a=a/10){
            int rev=a%10;
            sum=sum*10+rev;
        }
        System.out.println(sum+" is the reverse of the number"+a);
}
}
