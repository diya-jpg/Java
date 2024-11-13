public class quick_sort {
    static void displayArr(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
            }
    static void swap(int []arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int partition(int []arr,int st,int end){
        int pivot=arr[st];
        int count=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivot){
                count ++;
            }
        }
            int pivotidx=st+count;
            int i=st;
            int j=end;
         while(i<pivotidx&&j>pivotidx){
            while(arr[i]<=pivot)i++;
            while(arr[j]>pivot)j--;
            if(i<pivotidx&&j>pivotidx){
                swap(arr, st, pivotidx);
                i++;
                j--;
            }
         }
        return pivotidx;
        }
    static void quicksort(int[]arr,int st,int end){
if(st>=end){
    return;
}
int pi=partition(arr,st,end);
quicksort(arr, st, pi-1);
quicksort(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int []arr={6,3,1,5,4};
        quicksort(arr, 0, arr.length-1);
        displayArr(arr);
    }
}
