public class recursion_count {
  public static int rec(int n) {
      if (n == 0) {
          return 0;
      }
      
      // If the last digit is 0, add 1 to the count
      if (n % 10 == 0) {
          return 1 + rec(n / 10);
      } else {
          return rec(n / 10);
      }
  }
  
  public static void main(String[] args) {
      int n = 30201;
      System.out.println(rec(n)); // Output should be the count of 0s in n
  }
}
