package p1;
import access.Data;
import java.util.Scanner;

public class Display {
	public static void main(String[] args) {
		//Inf ob = new Inf();
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter College");
		String college = sc.next();
		System.out.println("Enter Score");
		int score = sc.nextInt();
		System.out.println("Enter City");
		String city = sc.next();
		//Data obj = new Data(id,name,college,score,city);
		Data obj = Data.getob(id,name,college,score,city);
		obj.disp();
		//System.out.println(obj.hashCode());
		//obj.details(id,name,college,score,city);
		
	}

}

/*
Create different packages
uses access modifiers
one package to another package use data
only 1 main method with scanner class set the data and display without null or default values
*/
