package p1;
public class Sta{
int a;
int b;
static int g;
public Sta(){
a=20;
b=30;
}
public void show(){
System.out.println(a);
System.out.println(b);
System.out.println(g);
}
static{
g=9;
}
public static void main(String[] args){
Sta jat = new Sta();
jat.a=6;
jat.b=90;
Sta man = new Sta();
man.a=70;
man.b=80;
jat.show();
man.show();
}}
