class BaseToDecimal {
    public static int toDecimal(String num, int base) {
        int decimal = 0;
        int power = 1; 
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            int digit;
            if (c >= '0' && c <= '9') {
                digit = c - '0';
            } else { // for A-F
                digit = c - 'A' + 10;
            }
            decimal += digit * power;
            power *= base;
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(toDecimal("1101", 2));  // 13
        System.out.println(toDecimal("1A", 16));   // 26
        System.out.println(toDecimal("31", 8));    // 25
    }
}
