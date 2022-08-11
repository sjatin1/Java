package access;

public class Data {
	static Data obj=null;
	private Data() {}
	public static Data getob(int id, String name, String college, int score, String city) {
		if(obj==null) {
			obj = new Data(id,name,college,score,city);
		}
		return obj;
	}
	public int id ;
	public String name ;
	public String college ;
	public int score;
	public String city;
	public Data(int id, String name, String college, int score, String city) {
		this.id=id;
		this.name=name;
		this.city=city;
		this.college=college;
		this.score=score;
	}
	public void disp() {
		if (score < 40) {
			System.out.println("Fail");
		}
		else if (score > 40 && score < 50 ){
			System.out.println("E grade");
		}
		else if (score > 50 && score < 60 ){
			System.out.println("D grade");
		}
		else if (score > 60 && score < 70 ){
			System.out.println("C grade");
		}
		else if (score > 70 && score < 80 ){
			System.out.println("B grade");
		}
		else if (score > 80 && score < 90 ){
			System.out.println("A grade");
		}
		else if (score > 90 && score < 100){
			System.out.println("A+ grade");
		}
		else {
			System.out.println("A++ grade");
			
		}
	}
	

}
