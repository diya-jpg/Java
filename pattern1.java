class pattern1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {          // rows
            for (int j = 0; j < 5; j++) {      // columns
                if (i == j || i + j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // new line after each row
        }
    }
}
