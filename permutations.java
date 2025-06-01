import java.util.*;
public class permutations {
    public static void recurpermutate(int index,int []nums,List<List<Integer>>ans){
        if(index==nums.length){
            List<Integer>ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            recurpermutate(index+1,nums,ans);
            swap(i,index,nums);
        }
    }
        private static void swap(int i,int j,int []nums){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
        }
    public static void printlist(List<List<Integer>>listOfLists){
        for (int i = 0; i < listOfLists.size(); i++) {
    List<Integer> innerList = listOfLists.get(i);
    for (int j = 0; j < innerList.size(); j++) {
        System.out.print(innerList.get(j)+" ");
    }
    System.out.println();
}
    }
    public static List<List<Integer>> permutate(int []arr){
        List<List<Integer>>answer=new ArrayList<>();
        recurpermutate(0,arr,answer);
        return answer;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
       List<List<Integer>>get= permutate(arr);
        printlist(get);
    }
}
