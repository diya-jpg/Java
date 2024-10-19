public class recursion_dice_combination {
    
        static int check(int n){
            if(n<0){
                return 0;
            }
           if(n==0){
               return 1;
           }
           int ans=0;
          for(int i=1;i<=6;i++){
              ans+=check(n-i);
          }
          return ans;
        }
        public static void main(String[] args) {
           int x=check(4);
           System.out.println(x);
        }
    
}
