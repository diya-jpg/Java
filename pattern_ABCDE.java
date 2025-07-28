public class pattern_ABCDE {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)('A'+j));
            }
            for(int k=0;k<2*(5-i);k++){
                System.out.print(" ");
            }
            for(int b=i-1;b>=0;b--){
                System.out.print((char)('A'+b));
            }
            System.out.println();
        }
    }
}
