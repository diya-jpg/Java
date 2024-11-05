import java.util.*;
public class MaxNumbers {
    static int maxnumbersontable(int []bag){
HashSet<Integer>table=new HashSet<>();
int max=0;
for(int i=0;i<bag.length;i++){
    int num=bag[i];
    if(table.contains(num)){
        table.remove(num);
    }
    else{
        table.add(num);
        max=Math.max(max,table.size());
    }
}
return max;
    }
    public static void main(String[] args) {
        MaxNumbers m=new MaxNumbers();
        int []nums={2,1,1,3,2,3};
        int []arr={1,1};
        System.out.println(maxnumbersontable(nums));
    System.out.println(maxnumbersontable(arr));
    }
    
}
