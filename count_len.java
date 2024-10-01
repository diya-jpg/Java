public class count_len {
    static void solution(int []arr){
        int count = 1;
        int ans=1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;  
            } else {
                System.out.println(arr[i - 1] + " = " + count); 
                count = 1;  
            }
            ans = Math.max(ans, count);  
        }
           System.out.println(arr[arr.length-1]+"="+count);
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3,3};
        solution(arr);
    }
}
