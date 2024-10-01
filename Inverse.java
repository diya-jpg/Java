import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Inverse{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num= scn.nextInt();
        int sum=0;
        int temp=num;
        int count=0;
        while (temp!=0)
        {
            temp=temp/10;
            count=count+1;
        }
        int i=1;
        while (i<=count)
        {
            int d= num%10;
            int y= i*(int)Math.pow(10,d-1);
            sum = sum+y;
            num=num/10;
            i++;
    
        }
        System.out.println(sum);
        
        
    }
}