import java.util.*;
public class binarysearch {
    public static int search(int []arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            search(arr,target,0,m-1);
        }
    return search(arr,target,m+1,e);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,66,78};
        int target=5;
        System.out.println(search(arr,target,0,arr.length-1));
    }
}
