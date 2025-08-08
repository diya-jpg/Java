import java.util.*;
public class Jumping_Number {
    public static ArrayList<Integer> jumping(int n){
            ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<=n;i++){
            int x=i;
            int prevdigit=x%10;
            x=x/10;
            while(x!=0){
                int currdigit=x%10;
                if(Math.abs(currdigit-prevdigit)!=1){
                    break;
                }
                prevdigit=currdigit;
                x=x/10;
            }
        
            if(x==0){
                res.add(i);
            }

        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(jumping(20));
    }
}
