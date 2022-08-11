package p1;

class Emp{
	public Emp() 
	{
		//Default
		System.out.println("Default");
	}
	public Emp(int a, int b) 
	{
		//parametrizied
		System.out.println("Parametrized");
	}
	public Emp(float a, int b) 
	{
		//Overloaded
		System.out.println("Over loaded");
	}
	public Emp(Emp ob) 
	{
		//Obj parametrized
		System.out.println("Obj Parametrized");
	}
	
	
}
public class Const {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Emp obj1 = new Emp();
		Emp obj2 = new Emp(1,2);
		Emp obj3 = new Emp(1.2f,2);
		Emp obj4 = new Emp(obj1);

	}

}
