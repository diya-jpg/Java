class max_cons_1{

        public static int solution(int[] nums) {
            int count=0;
            int number=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==1){
                    
                    
                        count++;
                        if(number<count)
                        {
                            number=count;
                        }
                }
                    else{
                        
                     count=0;
                    
                    }
                   
                }
                return number;
            }
           
        
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,1,1,1,1,0};
        int x=solution(arr);
        System.out.println(x);
    }
}