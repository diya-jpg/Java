class y{

int get(int a,int b){
int c=a+b;
return c;
}

}
 public class z extends y{
int get(int a,int b){
System.out.println("Hi Gaurav");
int c=a+b;
return c;
}
public static void main(String[]args){
y ab=new y();
System.out.println(ab.get(5,3));

}
}