public class fibonacci_rec {
    public static int solution(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int prev = solution(n - 1);
        int prev2 = solution(n - 2);
        return prev + prev2;
    }

    public static void main(String[] args) {
        int n = 5;
        // Call the solution method and print the result
        System.out.println(solution(n));
    }
}
