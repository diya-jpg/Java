import java.util.Scanner;

class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n (number of elements in array):");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Taking input for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Checking each element for prime
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                System.out.println(arr[i] + " is a prime number");
            } else {
                System.out.println(arr[i] + " is not a prime number");
            }
        }
    }

    // Method to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // check up to the square root of the number
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
