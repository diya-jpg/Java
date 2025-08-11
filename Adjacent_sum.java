import java.util.Scanner;

public class Adjacent_sum {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        String str=String.valueOf(num);
        int maxSum=0;
        if(str.length()<2){
            System.out.println("Number should have two digits");
        }
        for (int i = 0; i < str.length(); i++) {
            int d1 =  Integer.parseInt(String.valueOf(str.charAt(i)));
;
            for (int j = i + 2; j < str.length(); j++) {
                int d2 =Integer.parseInt(String.valueOf(str.charAt(j))) ;
                int sum = d1 + d2;
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
System.out.println(maxSum);
    }
}
