import java.util.*;
public class Divisible_by5and3 {
    public static int hcf(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int lcm(int a,int b){
        int n=a*b/hcf(a,b);
        return n;
    }
    public static ArrayList<Integer> divisible(int n){
        int c=lcm(3,15);
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<n;i+=c){
            res.add(i);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(divisible(50));
    }
}
