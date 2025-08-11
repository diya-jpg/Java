import java.util.*;
public class two_pair {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int target=6;
        HashSet<Integer>set=new HashSet<>();
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
       
        for(int i=0;i<arr.length;i++){
             ArrayList<Integer>in=new ArrayList<>();
            if(set.contains(target-arr[i])){
                in.add(arr[i]);
                in.add(target-arr[i]);
                res.add(in);
            }
            set.add(arr[i]);
        }
System.out.println(res);
    }
}
