import java.lang.*;
public class pythagorean {
    public static void main(String[]args){
        int a=3,c=4,d=5,h,b,p;
        if(a>c){
            if(a>d){
                h=a;
                b=c;
                p=d;
            }
            else{
                h=d;
                b=c;
                p=a;
            }
        }
        else{
            if(c>d){
             h=c;
             p=a;
b=d;
            }
            else{
                h=d;
                b=c;
                p=a;
            }
        }
        if(Math.pow(h,2)==Math.pow(b,2)+Math.pow(p,2)){
            System.out.println("It is a triangle");
        }
        else{
            System.out.println("It is not a triangle");
        }
    }
}
