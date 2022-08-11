class Def
{

int a;
float b;
char c;
boolean d;

public void disp()
{
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
}

public static void main(String[] args)
{
Def obj = new Def();
obj.disp();

System.out.println(obj.d);
}
}
