public class Recursion_arr_print {
    public static int maxInArray(int arr[],int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallAns=maxInArray(arr,idx+1);
       return Math.max(arr[idx],smallAns);
    }
    public static void print(int arr[],int index){
        if(index==arr.length-1){
            return;
        }
        System.out.print(arr[index]+" ");
        print(arr,index+1);
    }
    public static void main(String[] args) {
       int arr[]={5,6,7,8,9};
       print(arr, 0);
      int v=  maxInArray(arr,0);
      System.out.println(v);
    }
}
