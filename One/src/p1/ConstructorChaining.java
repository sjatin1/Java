package p1;

class Lec{
	//Lec ob = new Lec(); Cannot Create Obj Inside Class
	public Lec() {
		this("java");
		System.out.println("Def");
	}
	public Lec(String r) {
		this(1);
		System.out.println("String");
	}
	public Lec(int a) {
		System.out.println("int");
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lec ob = new Lec();

	}

}
