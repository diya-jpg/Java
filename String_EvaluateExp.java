public class String_EvaluateExp {
    public static int eval(String[] operations) {
        int i=0;
        for(String operation:operations){
            switch(operation){
                case "++X":  case"X++":
                i++;
                break;
                default:
                i--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        String[] x = {"X++", "++X", "X++", "--X"};
        String[]x1={"--X","X++","X++"};
        System.out.println(eval(x1));
    }
}
