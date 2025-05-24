public class pattern12 {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int k=0;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<7-2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i=3;i>=0;i--){
            for(int k=0;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<7-2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
