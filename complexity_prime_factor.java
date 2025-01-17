import java.util.*;
public class complexity_prime_factor {
    public static void factor(int x){
    for(int i=2;i<=x;i++){
           
        while (x%i==0) {
            System.out.print(i+" ");
            x=x/i;
    }
    }
}
public static int divisor(int x) {
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for (int i = 2; i <= x; i++) {
        int count = 0;
        while (x % i == 0) {
            x /= i;
            count++;
        }
        if (count > 0) {
            map.put(i, count);
        }
    }
    int totalDivisors = 1;
    for (int power : map.values()) {
        totalDivisors *= (power + 1);
    }
    return totalDivisors;
}
public static void main(String[]args){
    int x=25;
    factor(x);
    System.out.println("");
   System.out.println( divisor(x));
}
}
