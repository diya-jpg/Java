import java.util.Scanner;

public class Password_check {
    public static void main(String[]args){

         Scanner sc = new Scanner(System.in);
System.out.println("Enter the password");
        while (true) {
            int X = sc.nextInt();  
            if (X == 1999) {       
                System.out.println("Correct");
                break;            
            } else {
                System.out.println("Wrong"); 
            }
        }
    }
}
