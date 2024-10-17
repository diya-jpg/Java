
public class recursion1 {
    static void recur(int n){
        if(n == 0) return;
       
        System.out.print(n);
        recur(n-1);
        System.out.println("");
       
        System.out.print(n);
    }
    public static void main(String[] args) {
        int n = 5;
       
        recur(n);
    }
}
