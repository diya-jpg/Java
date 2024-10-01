
public class maximum_element {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5, 4 }; // Example array

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];

            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    if (arr[i] > max) {
                        max = arr[j];
                    }
                }

                System.out.println("Max in subarray [" + i + ", " + j + "] is: " + max);
            }
        }
    }
}

// s.insert(x);
// s.find(x)!=s.end()
// s.begin(),s.end()
