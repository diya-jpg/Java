import java.util.Arrays;

public class binary_search {
   static int binary_search(int arr[],int target){
    int n=arr.length;
int left=0;
int right=n-1;
while(left<=right){
    int mid=(left+right)/2;
    if(arr[mid]==target){
        return mid;
    }
   else if(arr[mid]<target){

        left=mid+1;
    }
    else{
        right=mid-1;
    }
    
}
return -1;
    }
    public static void main(String[] args) {
        int []arr={4,1,5,3,2};
        int target=3;
          Arrays.sort(arr);
        int result=binary_search(arr,target);
        if(result!=1){
            System.out.println("Element is present at index "+result);

        }
        else{
            System.out.println("Element is not present in array");
        }
    }
}
