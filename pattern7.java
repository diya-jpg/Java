public class pattern7 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=4;j-2>=i;j++){
                System.out.println(" ");
            }
            System.out.println();
            for(int k=1;k>=i;k++){
                System.out.println();
            }
        }
    }
}
