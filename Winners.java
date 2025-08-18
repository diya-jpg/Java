import java.util.*;
public class Winners {
    public static List<String> score(int []arr){
        int n=arr.length;
       int[][] scores = new int[n][2];
        for (int i = 0; i < n; i++) {
            scores[i][0] = arr[i]; // score
            scores[i][1] = i;      // index
        }

      Arrays.sort(scores, (x, y) -> y[0] - x[0]);

        String[] result = new String[n];
           for (int i = 0; i < n; i++) {
            if (i == 0) result[scores[i][1]] = "Gold Medal";
            else if (i == 1) result[scores[i][1]] = "Silver Medal";
            else if (i == 2) result[scores[i][1]] = "Bronze Medal";
            else result[scores[i][1]] = String.valueOf(i + 1); // rank number
        }

        return Arrays.asList(result);

    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
       System.out.println( score(arr));
    }
}
