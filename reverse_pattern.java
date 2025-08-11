public class reverse_pattern {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<7-2*i;j++){
                System.err.print("*");
            }
            
            System.out.println();
        }
    }
}
