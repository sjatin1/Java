package p1;

public class Obtype{
	int id =11;
	static int a = 90;
	
	public void disp() {
		System.out.println(id + " " + Obtype.a);
	}
	
	//FActory methods to create objects
	public Obtype getobj() {
		return new Obtype();
	}
	public Obtype getobj(Obtype obj) {
		return obj;
	}


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Obtype ob = new Obtype();
		Obtype ob1 = new Obtype();
		Obtype obj1 = ob1.getobj();
		//Obtype obj2 = (Obtype) ob.clone();
		ob.disp();
		System.out.println(ob);
		System.out.println(ob1);
		System.out.println(ob.hashCode());
		System.out.println(ob1.hashCode());
		System.out.println(obj1.hashCode());
		//System.out.println(obj2.hashCode());

	}

}
