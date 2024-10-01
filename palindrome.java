import java.util.Scanner;
public class palindrome {
    static int reverse(int x){
        int rev = 0;
        while(x != 0) {
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
    }
    return rev;
}
    public static void main(String[] args) {
        {Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int n=sc.nextInt();
            if (n == reverse(n)) {
                System.out.println("palindrome");
            }
                else{
                    System.out.println("not palindrome");
                }
        
    }
}
}
