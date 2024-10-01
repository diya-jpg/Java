import java.util.*;

public class sub_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String a = sc.nextLine();
        for (int i = 0; i < a.length(); i++) {
            for (int j = i; j < a.length(); j++) {
                for (int k = i; k <= j; k++) {
                    System.out.println(a.charAt(k));
                }
                System.out.println("\n");
            }

        }
    }
}
