public class remove_element {
    public static int remove(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
if(arr[i]!=arr[j]){
i++;
arr[i]=arr[j];

}
else{
    System.out.println("Duplicate Element = "+arr[j]);
}

        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,3,4,5};
        System.out.println(arr.length);
       System.out.println( remove(arr));
    }
}
