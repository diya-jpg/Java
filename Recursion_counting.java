public class Recursion_counting {
    // public static void print(int n){
    //     if(n==0){
    //         return;
    //     }
    //     print(n-1);
    //     System.out.println(n);
    // }
    public static void print2(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print2(n-1);
      
    }

    public static void main(String[] args) {
        int n = 5;
        print2(n);
    }
}
