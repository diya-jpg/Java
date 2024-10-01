public class number_rec {
    public static void solution(int n){
if(n==0){
    return ;
}
solution(n-1);
System.out.println(n);


    }
    public static void solution1(int n){
       if(n==0){
        return ;
       }
       System.out.println(n);
       solution1(n-1);
        
            }
    public static void main(String[] args) {
        int n=5;
    System.err.println("Ascending");
        solution(n);
        System.out.println("Descending");
        solution1(n);
       // System.out.println(x);
    }
}