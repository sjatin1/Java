class Methodd{
public int type1(int a, int b){
System.out.println(" Type " );
return a;
}
public void type2(){
System.out.println(" Type 2 ");
}
public void type3(int c){
System.out.println(" Type 3 ");
}
public int type4(){
System.out.println(" Type ");
return 4;
}
public static void main(String[] args)
{
Methodd ob = new Methodd();
System.out.println(ob.type1(1,2));
ob.type2();
ob.type3(3);
System.out.println(ob.type4());
}
}

