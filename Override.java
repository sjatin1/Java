class Override{
public void dispp(){
System.out.println("Different");
}
}

class Over extends Override{
//@Override
public void dispp(){
System.out.println("Same");
}
}

class Execute{
public static void main(String[] args){
Override ob = new Over();
ob.dispp();
}
}
