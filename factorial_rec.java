public class factorial_rec {
    public static int solution(int n){
if(n==0){
    return 1;
}

return n*solution(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int x=solution(5);
        System.out.println(x);
    }
}
