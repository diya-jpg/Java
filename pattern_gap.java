public class pattern_gap {
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(i==2&&j==4||i==3&&j==3||i==3&&j==4||i==4&&j==2||i==4&&j==3||i==4&&j==4){
                    System.out.print(" "+" ");
                }
                else{
                    System.out.print("*"+" ");
                }
                
            }
            System.out.println();
        }
        System.out.println();
         for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==2&&j==3||i==3&&j==2||i==3&&j==3){
                    System.out.print(" "+" ");
                }
                else{
                    System.out.print("*"+" ");
                }
                
            }
            System.out.println();
        }
    }
}
