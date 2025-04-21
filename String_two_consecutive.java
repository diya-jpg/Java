import java.util.Scanner;

public class String_two_consecutive{
    public static void candycrush(String s){
        StringBuffer str=new StringBuffer(s);
        int i =0;
        while(i<str.length()-1){
            char ch1=str.charAt(i);
            char ch2=str.charAt(i+1);
            if(ch1==ch2){
             str.delete(i,i+2);
             i--;
             continue;
            }
            i++;
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
        String s=sc.nextLine();
        candycrush(s);

    }
}
