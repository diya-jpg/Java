public class recursion_gcd_lcm {
    public static int  solution(int n,int k){
        if(k==0){
            return n;
    }
    return solution(k,n%k);
}
    public static void main(String[] args) {
        System.out.println(solution(4,9));
    }
}
