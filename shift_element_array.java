import java.util.*;
public class shift_element_array {
    public static void main(String[] args) {
        int arr[]={10,45,10,10,87,45,96,23,78,10};
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]==10&&arr[j]!=10){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
         else   if(arr[i]!=10&&arr[j]!=10){
            i++;
         }
         else{
            j--;
         }
        }
        System.out.println(Arrays.toString(arr));
    }
}
