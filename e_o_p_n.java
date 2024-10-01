public class e_o_p_n {
    public static void main(String []args){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int count1=0,count2=0,count3=0,count4=0;
    for(int i=0;i<arr.length;i++){
        if(i>0){
            count1++;
        }
        if(i<0){
            count2++;
        }
        if(i%2==0){
            count3++;
        }
        if(i%2!=0){
            count4++;
        }
    }
    System.out.println("positive:"+count1);
    System.out.println("negative:"+count2);
    System.out.println("even:"+count3);
    System.out.println("odd:"+count4);
    }
}
