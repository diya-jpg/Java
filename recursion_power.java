public class recursion_power {
    public static int power(int a,int b){
        if(b==0){
            return 1;
        }
        int smallpow=power(a,b/2);
        // return power(a,b-1)*a;
        if(b%2==0){
return smallpow*smallpow;
        }
        else{
            return smallpow*smallpow*a;
        }
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
