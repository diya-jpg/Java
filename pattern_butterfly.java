public class pattern_butterfly {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
          for(int k=i;k<5-1;k++){
            System.out.print(" ");
          }
           for(int k=i;k<5-1;k++){
            System.out.print(" ");
          }
          for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
           for(int i =0; i <5; i++){
             for(int j=5-1;j>i;j--){
                System.out.print("*");
            }
          for(int k=0;k<=i;k++){
            System.out.print(" ");
          }
           for(int k=0;k<=i;k++){
            System.out.print(" ");
          }
          for(int j=5-1;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        
          }
    }
}
