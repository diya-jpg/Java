public class recursion_sum_digits {
   
        public static int addDigits(int num) {
            if(num>0&&num<=9){
                return num;
            }
           
            return addDigits(num/10)+num%10;
        }
    
    public static void main(String[] args) {
        
        int x=addDigits(567);
        System.out.println(x);
    }
}
