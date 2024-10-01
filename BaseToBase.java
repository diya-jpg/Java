public class BaseToBase {
    public static void main(String[] args) {
        int n = 172, a = 10, i, count = 0, sum = 0;
        for (i = n; n != 0; n = n / a) {
            int rem = n % a;
            sum = sum + rem * (int) Math.pow(8, count);
            count++;
        }

        System.out.println("Octal representation: " + sum);

        int b = 8;
        int x = 0, y = 0;
        int temp = sum;
        for (i = temp; temp != 0; temp = temp / b) {
            int re = temp % b;
            x = x + re * (int) Math.pow(10, y);
            y++;
        }

        System.out.println("Decimal representation: " + x);
    }
}