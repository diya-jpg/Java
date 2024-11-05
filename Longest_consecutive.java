import java.util.*;
public class Longest_consecutive {
    public static int longest(int []nums){
        HashSet<Integer>st=new HashSet<>();
        for(int num:nums){
            st.add(num);
        }
        int maxStreak=0;
        for(int num:st){
if(!st.contains(num-1)){
    int currNum=num;
    int currStreak=1;
    while(st.contains(currNum+1)){
currStreak++;
currNum++;
    }
    maxStreak=Math.max(maxStreak,currStreak);
        }
    }
    return maxStreak;
}
   public static void main(String[] args) {
    Longest_consecutive l=new Longest_consecutive();
    int arr[]={100,1,2,200,3,4};
    System.out.println(longest(arr));
   } 
}
