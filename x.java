class x{
// private int a,b,c;
// x(int a,int b,int c){
// this.a=a;
// this.b=b;
// this.c=c;
// }

int get(int a,int b){
int c=a*b;
return c;
}
int get(int a,int b,int c){
int d=a*b*c;
return d;
}
public static void main(String[]args){
x ab=new x();
System.out.println(ab.get(5,3,2));

}
}
