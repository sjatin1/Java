class Overload{
public int load(int a, float b)
{
return a;
}
public float load(float a, int b){
return a;
}
public static void main(String[] args)
{
Overload ob = new Overload();
System.out.println(ob.load(1,2.0f));
System.out.println(ob.load(1.0f,2));
}
}
