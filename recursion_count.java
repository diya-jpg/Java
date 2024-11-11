public class recursion_count {
  public static int rec(int n,int count) {
     
      if(n==0){
        return count;
      }
      if(n%10==0){
        return rec(n/10,count+1);
      }
      else{
        return rec(n/10,count);
      }
  }
  
  public static void main(String[] args) {
      int n = 30201;
      System.out.println(rec(n,0)); 
  }
}
