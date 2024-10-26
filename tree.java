public class tree {
    public static void check(int n,int m){
        if(m==6){
            return;
        }
      
        if(n == 1) return;
        check(n-1,m);
        System.out.println(n+" "+m);
        check(n,m+1);
      
      
    }
    public static void main(String[] args) {
        check(5,4);
    }
}
