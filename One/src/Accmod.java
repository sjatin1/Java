
public class Accmod {
	private int a=0;
			int b=0;
	protected int c=1;
	public int d=2;
	
	public void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Out extends Accmod {
	public void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
