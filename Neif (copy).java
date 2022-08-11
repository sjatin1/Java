class Neif
{
public void see(){
int age=20,ht=175,wt=100,fatpercent=30;
if(age>=20 && age<=65)
{
	if(ht>140 && ht<=175)
	{
		if(wt<75)
		{
		System.out.println("Normal");
		}
		else if(wt>75 && wt<=100)
		{
			if(fatpercent>25)
			{
			System.out.println("Obese");
			}
			else{
			System.out.println("Over Weight");
			}
		}
		else{
		System.out.println("Not available");
		}
	}
	else
	{
	System.out.println("Not available");
	}
}
else{
System.out.println("Not available");
}
}
public static void main(String[] args)
{
Neif ob = new Neif();
ob.see();
}
}
