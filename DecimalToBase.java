public class DecimalToBase {
    public static String convert(int decimal, int base) {
        if (decimal == 0) return "0";

        String digits = "0123456789ABCDEF"; 
        StringBuilder sb = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % base;
            sb.append(digits.charAt(remainder));
            decimal /= base;
        }

        return sb.reverse().toString(); 
    }

    public static void main(String[] args) {
        System.out.println(convert(25, 2));  // Binary: 11001
        System.out.println(convert(25, 8));  // Octal: 31
        System.out.println(convert(25, 16)); // Hex: 19
    }
}
