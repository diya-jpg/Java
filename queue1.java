import java.util.*;
public class queue1 {
    static public void print(int []arr){
       
        Queue<Integer> queue = new PriorityQueue<Integer>();
        for(int i=0;i<arr.length;i++){
            queue.add(arr[i]);
        }
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.peek());
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of n");
       int n=sc.nextInt();
       int []arr=new int[n];
       System.out.println("Enter the elements");
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
    print(arr);  
    }
}
