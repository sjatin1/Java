import java.util.Scanner;
public class Inp {
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number to add");
		int i = sc.nextInt();
		System.out.println("Enter 2nd number to add");
		int j = sc.nextInt();
		System.out.println("" + i + " + " + j + " is " + (i+j));
	}
	public void sub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number to subtract");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number to subtract");
		int b = sc.nextInt();
		System.out.println("" + a + " - " + b + " is " + (a-b));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inp ad = new Inp();
		Inp su = new Inp();
		ad.add();
		su.sub();
		

	}

}
