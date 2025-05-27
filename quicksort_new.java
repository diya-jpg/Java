public class quicksort_new {
     public static  void quicksort(int []nums,int low,int high){
       if(low<high){
        int pivot=partition(nums,low,high);
        quicksort(nums,low,pivot-1);
        quicksort(nums,pivot+1,high);
       }
    }
    public static int partition(int []nums,int low,int high){
        int pivot=nums[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(nums[j]<pivot){
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp=nums[i+1];
        nums[i+1]=nums[high];
        nums[high]=temp;

        return i+1;
    }
    public static int[] sortArray(int[] nums) {
      quicksort(nums,0,nums.length-1);
      return nums;
    }
    public static void printarr(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
                
    }
    public static void main(String[] args) {
        int []arr={7,2,1,6,8,5,3,4};
        printarr(arr);
        System.out.println();
        int[] sorted = sortArray(arr);
        printarr(sorted);

    }
}
