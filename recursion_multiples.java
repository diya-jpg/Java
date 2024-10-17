public class recursion_multiples {
    static public void print_multiples(int n,int k){
if(k==1){
    System.out.println(n);
    return ;
}
else{
    print_multiples(n, k-1);
    System.out.println(n*k);
}
    }
    public static void main(String[] args) {
        print_multiples(12,5);
    }

}
