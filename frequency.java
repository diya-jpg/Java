public class frequency {
    public static void main(String []args){
        int n=5453,i,a,count=0;
        for(i=n;n!=0;n=n/10){
            int rem=n%10;
            if(rem==3){
                count++;
            }
         }
     
         System.out.println(count);}
}
