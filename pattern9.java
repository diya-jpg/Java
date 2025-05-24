public class pattern9 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n-i;j++){
                System.err.print(" ");
            }
            if (i == n) {
                // Last line: print 1 to 5 with spaces
                for (int j = 1; j <= n; j++) {
                    System.out.print(j);
                }
            } else if (i == 1) {
                // First line: print only 1
                System.out.println(1);
            } else if (i == 2) {
                // Second line: print 1 and 2 with space
                System.out.println("12");
            } else {
                // Lines like: 1   3, 1    4, etc.
                System.out.print(1);
                for (int space = 1; space <= i - 2; space++) {
                    System.out.print(" ");
                }
                System.out.println(i);
            }
        }
    }
}
