package p1;

class Single{
	static Single obj=null;
	private Single() {}
	public static Single getob() {
		if(obj==null) {
			obj = new Single();
		}
		return obj;
	}
}

public class SingleTn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single ob1 = Single.getob();
		Single ob2 = Single.getob();
		System.out.println(ob1.hashCode() + " " + ob2.hashCode());

	}

}
