public class bit_odd_even {
    public static boolean find_odd_or_even(int n){
        return(n&1)==1;
    }
    public static void main(String[] args) {
        int n=68;
        System.out.println(find_odd_or_even(n));
    }
}
