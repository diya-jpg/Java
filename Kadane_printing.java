public class Kadane_printing {
    public static int[] maxSubArray(int[] nums) {
        int maxn = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0; 
         int ansStart = 0;           
        int ansEnd = 0;       
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxn) {
                maxn = currentSum;
                ansStart = start;
                ansEnd = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                start = i + 1;  // Reset start to next element
            }
        }

        return new int[] { ansStart, ansEnd };
    }

    public static void print(int a, int b, int[] arr) {
        for (int i = a; i <= b; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] result = maxSubArray(nums);
        int a = result[0];
        int b = result[1];
        System.out.println("Max Subarray:");
        print(a, b, nums);
    }
}
