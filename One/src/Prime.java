
public class Prime {
	public void choose() {
		int i=3, temp=0;
		for(int k =1; k<=10; k++) {
		if(i%k==0){
		temp++;
		}
		}
		if(temp<=2) {
			System.out.println("Prime");
			
		}
		else {
			System.out.println("Not Prime");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime ob = new Prime();
		ob.choose();

	}

}
