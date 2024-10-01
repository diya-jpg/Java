import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class hashmap {
public int[] problem(int arr[],int target){
    int result[]=new int[2];

    Map<Integer, Integer> map = new HashMap<>();
for(int i=0;i<arr.length;i++){
if(map.containsKey(target-arr[i])){
   result[0]=i;
   result[1]=map.get(target-arr[i]);
}
map.put(arr[i],i);
}
return result;
}
static void print(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
}
}
    public static void  main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]={1,2,3,4,5,6};
    System.out.println("Enter the value of target");
    int target=sc.nextInt();
    int x[]=problem(arr,target);
    print(x);
   }
}