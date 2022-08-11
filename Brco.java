class Brco
{
public void cont(){
int i;

for(i=0; i<10; i++)
{
if (i>3){
continue;
}
if(i==5){
break;}
System.out.println(i);
}}
public static void main(String[] args)
{
Brco ob = new Brco();
ob.cont();
}}
