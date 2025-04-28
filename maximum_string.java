public class maximum_string {
    public static void get(String str){
        for(int i=0;i<str.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        
        }
    }
    public static void main(String[] args) {
        String str="diya";
        get(str);
    }
}
