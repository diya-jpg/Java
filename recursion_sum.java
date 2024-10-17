public class recursion_sum {
    public static int answer(int n){
        if(n == 0) {
            return 0;
    }
    return answer(n-1)+n;
}
    public static void main(String[] args) {
        System.out.println(answer( 5));
    }
}
