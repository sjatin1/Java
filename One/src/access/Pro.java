package access;
import Access.Accmod;
public class Pro extends Accmod{
	Accmod ob = new Accmod();
	public void disp() {
		//System.out.println(a); private
		//System.out.println(b); default
		//System.out.println(ob.c); //protected
		System.out.println(ob.d);
	}

}
class Prot extends Accmod{
	public void disp() {
		//System.out.println(a); private
		//System.out.println(b); default
		System.out.println(c);
		System.out.println(d);
	}
	
}