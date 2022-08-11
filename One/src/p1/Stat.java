package p1;

class Stu{
	public Stu() {
		System.out.println("Const");
	}
	static {
		System.out.println("Stu Static");
	}
	
	{
		System.out.println("Instance");
	}
	
	public Stu getob() {
		return new Stu();
	}
}

public class Stat {
	
	static {
		System.out.println("Stat Static");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		Stu ob = new Stu();
		Stu ob1 = new Stu();
		ob1.getob();
				

	}

}
