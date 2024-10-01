public class base_sub{
    public static void main(String[] args) {
        int a = 1212, b = 256, c = 8, borrow = 0, place = 1, diff, x;
        int y = 0;
        for (int tempA = a, tempB = b; tempA!= 0 || tempB!= 0; tempA /= 10, tempB /= 10) {
            int digitA = tempA % 10; // get the last digit of a
            int digitB = tempB % 10; // get the last digit of b
            diff = digitA - digitB - borrow;
            if (diff < 0) {
                diff += c;
                borrow = 1;
            } else {
                borrow = 0;
            }
            y += diff * place;
            place *= 10;
        }
        // Print the result
        System.out.println("Result: " + y);
    }
}