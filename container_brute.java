
import java.util.*;

public class container_brute {
    static int print(int arr[]) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int area=(j-i)*(Math.min(arr[i],arr[j]));
                if(area>max){
                    max=area;
                }
            }
           
        }
return max;
    }

   
    public static void main(String[] args) {
      int []arr={2,5,4,3,1};
int x=print(arr);
System.out.println("Maximum area of rectangle is "+x);
}
}
//Write code
// import  java.util.*;
// class Solution {
//     public int maxArea(int[] height) {
//         int n=height.length;
//         int left=0;
//         int right=n-1;
//         int maxArea=0;
//         while(left<right){
//             int area=(right-left)*(Math.min(height[right],height[left]));
//             maxArea = Math.max(maxArea, area);
//             if(height[left]>=height[right]){
// right --;
//             }
//             if(height[right]>height[left]){
//                 left ++;
//             }
//         }
//         return maxArea;
//     }
// }
