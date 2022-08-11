package p1;

class Methodchn{
	public void method1() {
		System.out.println("Method1");
		method2();
	}
	public void method2() {
		System.out.println("Method2");
		method3();
	}
	
	public void method3() {
		System.out.println("Method3");
		methodn();
	}
	public void methodn() {
		System.out.println("Methodn");
	}
}
public class Methodchaining {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Methodchn ob = new Methodchn();
		ob.method1();

	}

}
