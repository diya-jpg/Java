public class pattern5 {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
           System.out.println();
        }
        for(int i=0;i<4;i++){
            for(int j=2;j>=i;j--){
                System.out.print("*");
            }
           System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i=0;i<4;i++){
            for(int j=0;j<4-1-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
            
        }

        for(int i=0;i<4;i++){
            for(int k=0;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<4-1-i;j++){
                System.out.print("*");
            }
         
            System.out.println();
            
        }

          3
          
        
    }
}
